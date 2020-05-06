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
public class Desert extends Product {

    

    private int total_desert=30;
  //  private Adisyon adis;

    
    public Desert(int wait_time, int amount, String date, int total) {
        super(wait_time,amount,date,total);
       
        total_desert++;
        //Adisyon adis = new Adisyon(tarih, tutar);
    }
    
    @Override
    public int getTotal(int amount){
        return total_desert-amount-1;
    } 
    
  
    
  
    
}
