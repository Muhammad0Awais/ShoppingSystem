/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *This is the basic shop class.
 * @author Hp
 */
public class shopclass {
    private String name;
    private String location;
    private List<customer> customers=new ArrayList<customer>();
    private List<Consumer> consumers=new ArrayList<Consumer>();
    private List<clothesStock> clothesStocks=new ArrayList<clothesStock>();
    private List<foodStock> foodstocks=new ArrayList<foodStock>();
    private List<pharamacyStock> pharamacyStocks=new ArrayList<pharamacyStock>();
    private List<order> orders=new ArrayList<order>();

    //Customers getter
    public List<customer> getCustomers() {
        return customers;
    }
    
    //Customers setter
    public void setCustomers(customer cus) {
        assert cus!=null:"Invalid Customer!";
        this.customers.add(cus);
    }

    //Consumer getter
    public List<Consumer> getConsumers() {
        return consumers;
    }

    //Consumer setter
    public void setConsumers(Consumer con) {
        assert con!=null:"Invalid Consumer!";
        this.consumers.add(con);
    }

    //FoodStock Getter
    public List<foodStock> getFoodstocks() {
        return foodstocks;
    }

    //Food Stock setter
    public void setFoodstocks(foodStock fs) {
        assert fs!=null:"Invalid FoodStock!";
        this.foodstocks.add(fs);
    }
    
    //pharamacy stock getter
    public List<pharamacyStock> getPharamacyStocks() {
        return pharamacyStocks;
    }

    //pharamacy stock setter
    public void setPharamacyStocks(pharamacyStock ps) {
        assert ps!=null:"Invalid Pharmacy!";
        this.pharamacyStocks.add(ps);
    }

    //Getter for clothes stock
    public List<clothesStock> getClothesStocks() {
        return clothesStocks;
    }

    //Setter for clothes Stock
    public void setClothesStocks(clothesStock closc) {
        assert closc!=null:"Invalid Clothes Stock!";
        this.clothesStocks.add(closc);
    }
    
    //order getter
    public List<order> getOrders() {
        return orders;
    }

    //Order setter
    public void setOrders(order or) {
        assert or!=null:"Invalid order!";
        this.orders.add(or);
    }
    
    //name getter
    public String getName() {
        return name;
    }

    //name setter
    public void setName(String name) {
        assert name!=null:"name can't be null";
        this.name = name;
    }

    //Location getter
    public String getLocation() {
        return location;
    }

    //Location setter
    public void setLocation(String location) {
        assert location!=null:"Location can't be null";
        this.location = location;
    }
    
    //Method for printing all orders
    public void printallOrders(){
        System.out.println("------Orders-------");
        for (order or :orders)
        {
            System.out.println("----------------------------");
            System.out.println("Product: "+or.getInVentory().getName());
            System.out.println("Date "+or.getDate());
            System.out.println("Amount: "+or.getAmount());
            System.out.println("Price: "+or.getPrice());
            System.out.println("Customer: "+or.getCustomer().getName());
            System.out.println("Consumer: "+ or.getConsumer().getName());
        }
        System.out.println("----------------------------");
    }
    
    //Method for printing all customers
    public void printallcustomers(){
        System.out.println("------Customers-------");
        for (customer cs :customers)
        {
            System.out.println("----------------------------");
            System.out.println("Name: "+cs.getName());
            System.out.println("Gender: "+cs.getGender());
            System.out.println("Age: "+cs.getAge());
        }
        System.out.println("----------------------------");
    }
    
    //Method for pringitnn all consumers
    public void printallconsumers(){
        System.out.println("------Consumers-------");
        for (Consumer cs :consumers)
        {
            System.out.println("----------------------------");
            System.out.println("Name: "+cs.getName());
            System.out.println("Gender: "+cs.getGender());
            System.out.println("Age: "+cs.getAge());
            System.out.println("------Consumer Orders-------");
            for (order or :cs.getOrList())
            {
                System.out.println("Product: "+or.getInVentory().getName());
                System.out.println("Date "+or.getDate());
                System.out.println("Amount: "+or.getAmount());
                System.out.println("Price: "+or.getPrice());
                System.out.println("Customer: "+or.getCustomer().getName());
                System.out.println("Consumer: "+ or.getConsumer().getName());
                System.out.println("----------------------------");
            }
        }
        System.out.println("----------------------------");
    }
    
    //Method for printing all Stocks
    public void printAllColthesStocks(){
        System.out.println("------Stocks-------");
        for (clothesStock st :clothesStocks)
        {
            System.out.println("----------------------------");
            for(Map.Entry entry:st.getInventoryAmount().entrySet()){
                System.out.println("Product: "+((clothes)entry.getKey()).getName());
                System.out.println("Product Size: "+((clothes)entry.getKey()).getSize());
                System.out.println("Quantity left: "+ entry.getValue());
                System.out.println("----------------------------");
            }
        }
    }
    
    //Method for printing Food Stocks
    public void printAllFoodStocks(){
        System.out.println("------Food Stocks-------");
        for (foodStock fs :foodstocks)
        {
            System.out.println("----------------------------");
            for(Map.Entry entry:fs.getInventoryAmount().entrySet()){
                System.out.println("Product: "+((food)entry.getKey()).getName());
                System.out.println("Product Expiration: "+((food)entry.getKey()).getExpirationDate());
                System.out.println("Quantity left: "+ entry.getValue());
                System.out.println("----------------------------");
            }
        }
    }
    
    //Method for printing pharamacy Stocks
    public void printAllPharamacyStocks(){
        System.out.println("------Pharamacy Stocks-------");
        for (pharamacyStock ps :pharamacyStocks)
        {
            System.out.println("----------------------------");
            for(Map.Entry entry:ps.getInventoryAmount().entrySet()){
                System.out.println("Product: "+((pharamacy)entry.getKey()).getName());
                System.out.println("Product expiration Date: "+((pharamacy)entry.getKey()).getExpirationDate());
                System.out.println("Quantity left: "+ entry.getValue());
                System.out.println("----------------------------");
            }
        }
    }
    
    //Removing Inventory from stock
    public void removeInventory(stock st, inventory in)
    {
        st.getInventoryAmount().remove(in);
        System.out.println("Deleted Inventory : " + in.getName());
    }

    //Printing shop details
    public void printShopDetails() {
        System.out.println("Shop Name: "+name);
        System.out.println("Shop Location: "+this.location);
    }
}
