/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

/**
 *this is clothes stock class
 * @author Hp
 */
public class clothesStock extends stock {

    //Constructor for setting up the catagory name
    public clothesStock() {
        this.catagorey="Clothes";
    }
    
    //Clothes catagory getter
    public String getCatagorey() {
        return catagorey;
    }        
}
