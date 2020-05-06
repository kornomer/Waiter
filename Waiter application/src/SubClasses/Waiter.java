/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubClasses;

import Abstract.*;

/**
 *
 * @author lenovo
 */
public class Waiter extends Cafe{
    
    private String name;
    private String password;

    public Waiter(int number,String name, String password) {
        
        super(number);
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return password;
    }

    @Override
    public String toString() {
        return "\nGarson{" + "Name= " + name + '}';
    }
    
    
    
}
