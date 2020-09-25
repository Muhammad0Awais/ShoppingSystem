/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author Hp
 */
public abstract class stock {
    protected String catagorey;
    protected Hashtable<inventory, Integer> InventoryAmount;

    //Stock Constructor for setting up values
    public stock() {
        this.catagorey = "";
        this.InventoryAmount = new Hashtable<inventory, Integer>();
    }

    //Getter for InventoryAmount Hashmap
    public Hashtable<inventory, Integer> getInventoryAmount() {
        return InventoryAmount;
    }

    //Method for setting up the invenotryAmount hashmap
    public void setInventoryAmount(inventory in, int amount) {
        assert (in!=null || amount>0):"This list can't be null";
        this.InventoryAmount.put(in, amount);
    }
    
    //Method for updating inventory amount after a sale is made
    public void updateInventoryAmount(inventory in, int amount) {
        assert (in!=null || amount>0):"The inventory object can't be null";
        int newamount=this.InventoryAmount.get(in).intValue()-amount;
        this.InventoryAmount.put(in, newamount);
    }
}
