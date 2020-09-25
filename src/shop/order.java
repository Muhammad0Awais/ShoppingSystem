/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.time.LocalDate;

/**
 *This class contains the details of the order
 * @author Hp
 */
public class order {
    private int price,amount;
    private LocalDate date;
    private customer Customer;
    private Consumer consumer;
    private inventory inVentory;

    //price getter
    public int getPrice() {
        return price;
    }

    //price setter
    public void setPrice(int price) {
        assert price>0:"Invalid Price!";
        this.price = price;
    }

    //Quantity Getter
    public int getAmount() {
        return amount;
    }

    //Quantity Setter
    public void setAmount(int amount) {
        assert(amount>1):"Invalid Amount";
        this.amount = amount;
    }

    //Date getter
    public LocalDate getDate() {
        return date;
    }

    //Date setter
    public void setDate(LocalDate date) {
        assert(date!=null):"Invalid Date!";
        this.date = date;
    }

    //Customer Getter
    public customer getCustomer() {
        return Customer;
    }

    //Customer Setter
    public void setCustomer(customer Customer) {
        assert Customer!=null:"Invalid Customer";
        this.Customer = Customer;
    }

    //Consumer Getter
    public Consumer getConsumer() {
        return consumer;
    }

    //ConsumerSetter
    public void setConsumer(Consumer consumer) {
        assert consumer!=null:"Invalid Consumer";
        this.consumer = consumer;
    }

    //InventoryGetter
    public inventory getInVentory() {
        return inVentory;
    }

    //Inventory Setter
    public void setInVentory(inventory inVentory) {
        assert inVentory!=null:"Invalid Inventory";
        this.inVentory = inVentory;
    }
    
    
}
