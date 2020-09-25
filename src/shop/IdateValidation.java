/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.time.LocalDate;

/**
 *This interface is for checking the date validation
 * @author Hp
 */
public interface IdateValidation {
    Boolean dateValidation(LocalDate date);//Function to be implemented in child class for validation of date
}
