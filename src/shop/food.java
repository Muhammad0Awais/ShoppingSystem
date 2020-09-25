/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *This si the food inventory class
 * @author Hp
 */
public class food extends inventory implements IdateValidation{
    private LocalDate expirationDate;
    
    //expiration Date getter
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    //Expiration Date Setter
    public void setExpirationDate(String expDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(expDate, formatter);
        assert dateValidation(date):"Product Expired!";
        this.expirationDate=date;
    }
    
    //Validation of Expiration Date
    @Override
    public Boolean dateValidation(LocalDate date) // This function is for validating the date so that it can check wether the product is expired or not
    {
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