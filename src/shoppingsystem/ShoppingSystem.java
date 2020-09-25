/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingsystem;

import java.time.LocalDate;
import shop.Consumer;
import shop.clothes;
import shop.clothesStock;
import shop.customer;
import shop.food;
import shop.foodStock;
import shop.order;
import shop.pharamacy;
import shop.pharamacyStock;
import shop.shopclass;
import shop.stock;


/**
 * Don't forget to use Contracts, Interfaces, and abstract classes.
 * Don't forget to search for the real life usage of OOP Concepts
 * Don't forget to write comments for everything
 * @author Hp
 */
public class ShoppingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating Shop Class object
        shopclass sc=new shopclass();
        sc.setName("Alpine brands");
        sc.setLocation("Moscow");
        
        //Creating Customer        
        customer customer1=new customer();
        customer1.setAge(35);
        customer1.setGender("male");
        customer1.setName("Alex");
        sc.setCustomers(customer1);
        
        //Creating Consumer
        Consumer consumer=new Consumer();
        consumer.setAge(35);
        consumer.setGender("male");
        consumer.setName("Andrey");
        sc.setConsumers(consumer);
        
        //Creating food inventory
        food Food=new food();
        Food.setCreateDate(LocalDate.now());
        Food.setName("Yougurt");
        Food.setPrice(500);
        Food.setExpirationDate("September 30, 2020");
        
        //Creating foodstock
        foodStock fs=new foodStock();
        fs.setInventoryAmount(Food,50);
        
        //Making order
        order or=new order();
        or.setAmount(10);
        or.setDate(LocalDate.now());
        or.setPrice(Food.getPrice()*or.getAmount());
        or.setInVentory(Food);
        or.setConsumer(consumer);
        or.setCustomer(customer1);
        
        //Validating the order
        if(Food.dateValidation(LocalDate.now()) && consumer.quantityValidation(fs, or,Food))
        {
            consumer.createOrder(or);
            fs.updateInventoryAmount(Food, or.getAmount());
            sc.setOrders(or);
        }
        
        Food=new food();
        Food.setCreateDate(LocalDate.now());
        Food.setName("bread");
        Food.setPrice(50);
        Food.setExpirationDate("September 29, 2022");
        fs.setInventoryAmount(Food,10);
        //Removing bread inventory from food stock
        sc.removeInventory(fs, Food);
        //Saving stock 
        sc.setFoodstocks(fs);
        
        //Creating Pharamacy inventory
        pharamacy ph=new pharamacy();
        ph.setCreateDate(LocalDate.now());
        ph.setName("Paracatemol");
        ph.setPrice(500);
        ph.setExpirationDate("September 29, 2022");
        
        //Creating Phramacy Stock
        pharamacyStock ps=new pharamacyStock();
        ps.setInventoryAmount(ph,50);
        sc.setPharamacyStocks(ps);
        
        //Making pharmacy order
        or=new order();
        or.setAmount(30);
        or.setDate(LocalDate.now());
        or.setPrice(ph.getPrice()*or.getAmount());
        or.setInVentory(ph);
        or.setConsumer(consumer);
        or.setCustomer(customer1);
        
        //Validation is done before approving the order
       if(ph.dateValidation(LocalDate.now())&&consumer.quantityValidation(ps, or,ph))
        {
            consumer.createOrder(or);
            ps.updateInventoryAmount(ph, or.getAmount());
            sc.setOrders(or);
        }
        
        //Creating clothes Inventory
        clothes cl=new clothes();
        cl.setCreateDate(LocalDate.now());
        cl.setName("T-shirt");
        cl.setSize(25);
        cl.setPrice(500);
        
        //Creating clothes stock
        clothesStock sct=new clothesStock();
        sct.setInventoryAmount(cl,50);
        sc.setClothesStocks(sct);
        
        //Creating order for clothes
        or=new order();
        or.setAmount(10);
        or.setDate(LocalDate.now());
        or.setPrice(cl.getPrice()*or.getAmount());
        or.setInVentory(cl);
        or.setConsumer(consumer);
        or.setCustomer(customer1);
        
        //Validating the order
        if(consumer.quantityValidation(sct, or,cl))
        {
            consumer.createOrder(or);
            sct.updateInventoryAmount(cl, or.getAmount());
            sc.setOrders(or);
        }
        
        //printing all the data
        sc.printShopDetails();
        sc.printallcustomers();
        sc.printallconsumers();
        sc.printAllFoodStocks();
        sc.printAllPharamacyStocks();
        sc.printAllColthesStocks();
    }
    
}
