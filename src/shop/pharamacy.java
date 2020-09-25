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
 *Pharmacy Inventory Class
 * @author Hp
 */
public class pharamacy extends inventory implements IdateValidation{
    protected LocalDate expirationDate;
    
    //ExpirationDate Getter
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    //Expiration Date Setter
    public void setExpirationDate(String expDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(expDate, formatter);
        assert dateValidation(date):"Expiration Date can't be of today or in past";
        this.expirationDate=date;
    }
    
    // This function is for validating the date so that it can check wether the product is expired or not
    @Override
    public Boolean dateValidation(LocalDate date)
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
