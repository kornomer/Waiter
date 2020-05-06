/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubClasses;

import Abstract.*;


public class TableNo extends Cafe{
   
    private int numberOfPerson;

    public TableNo(int number,int numberofperson) {
        super(number);
        this.numberOfPerson=numberofperson;
    }

    public int getKişi_sayısı() {
        return numberOfPerson;
    }

    
    
    
    
}
