/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author lenovo
 */
public abstract class Cafe {
    
    private int number;
    private int total_product = 560;
    
    

    public Cafe(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "\n AMOUNT OF STORE: "+number;
    }
    
    

   
    
}
