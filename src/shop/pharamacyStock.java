/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.time.LocalDate;

/**
 *This is pharmacy stock class
 * @author Hp
 */
public class pharamacyStock extends stock implements IdateValidation {
    private LocalDate expirationDate;
    
    //Constructor for setting catagory
    public pharamacyStock() {
        this.catagorey="Pharamacy";
    }
    
    //getting catagory
    public String getCatagorey() {
        return catagorey;
    } 

    //Getting expiration date
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    //Setting expiration date and checking whether the product is already expired or not
    public void setExpirationDate(LocalDate expirationDate) {
        assert(dateValidation(expirationDate)):"Product is expired";
        this.expirationDate = expirationDate;
    }
    
    //Validating the expirationdate
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
