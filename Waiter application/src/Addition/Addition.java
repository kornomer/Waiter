/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Addition;

/**
 *
 * @author lenovo
 */
public class Addition {
    
    protected String date;
    protected int amount;

    public Addition(String date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    public String getName() {
        return date;
    }

    public int getAmount() {
        return amount;
    }
    
    
    
}
