/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

/**
 *This si clothes inventory class
 * @author Hp
 */
public class clothes extends inventory {
    private int size;

    //Size Getter
    public int getSize() {
        return size;
    }

    //Size setter
    public void setSize(int size) {
        assert (size>=15 && size<=60):"Size can't be less than 15 or greater then 60";
        this.size=size;
    }
}
