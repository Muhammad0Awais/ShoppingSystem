/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for Consumer, it contains getters and setters for list of orders, and create order is for creating the order.
 * We performed quantity validation for checking whether we have quantity in stock or not.
 * @author Hp
 */
public class Consumer extends people{
    private List<order> orList;

    public Consumer()//Each consumer will have number of orders 
    {
        orList=new ArrayList<order>();
    }
    
    public List<order> getOrList()//getting the orders palced by the consumer 
    {
        return orList;
    }
    
    public void createOrder(order or)//This function is for placing order.
    {
        orList.add(or);
    }
    
    public Boolean quantityValidation(stock st, order or, inventory in)// This function is for validating the quantity so that it is in stock or not
    {
        assert (st.getInventoryAmount().get(in)>=or.getAmount()):"The quantity of order is greater then the quantity of inventory";
        return true;
    }
    
    public void printallOrders(){
        System.out.println("------Orders-------");
        for (order or :orList)
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
}
