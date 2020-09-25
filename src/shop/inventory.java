/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.time.LocalDate;

/**
 *This class set's the inventory, all of the functions are getters and setter with validations
 * @author Hp
 */
public abstract class inventory {
    private String name;
    private int price;
    private LocalDate createDate;

    //Name Getter
    public String getName() {
        return name;
    }

    //Name Getter
    public void setName(String name) {
        assert (!name.isEmpty()):"Name can't be empty";
        this.name = name;
    }
    
    //Price Getter
    public int getPrice() {
        return price;
    }

    //Price Setter
    public void setPrice(int price) {
        assert(price>0):"Price can't be negative";
        this.price = price;
    }

    //Creation Date Getter
    public LocalDate getCreateDate() {
        return createDate;
    }

    //Creation Date Setter
    public void setCreateDate(LocalDate createDate) {
        //assert(createDate==LocalDate.now()):"Creation Date should be of todays";
        this.createDate = createDate;
    }
}
