/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.time.LocalDate;

/**
 *This is food stock class
 * @author Hp
 */
public class foodStock extends stock implements IdateValidation {
    private LocalDate expirationDate;

    
    //Constructor for setting up the catagory name
    public foodStock() {
        this.catagorey="Clothes";
    }
    
    //Catagory getter
    public String getCatagorey() {
        return catagorey;
    } 
    
    //ExpirationDate getter
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    //Expiration date setter
    public void setExpirationDate(LocalDate expirationDate) {
        assert(dateValidation(expirationDate)):"Product is expired";
        this.expirationDate = expirationDate;
    }
    
    //Expiry Date validation
    @Override
    public Boolean dateValidation(LocalDate date){
        LocalDate date4 = LocalDate.now();
        if (date.getYear()-date4.getYear()>0)
        {
            return true;
        }
        else 
        {
            if (date.getMonth().getValue()-date4.getMonth().getValue()>0)
            {
                return true;
            }
            else
            {
                if (date.getDayOfMonth()-date4.getDayOfMonth()>0 || date.getDayOfMonth()-date4.getDayOfMonth()==0)
                {    
                    return true;
                }
            }
        }
        return false;
    }     
}
