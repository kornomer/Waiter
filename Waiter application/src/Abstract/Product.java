/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;
import Addition.Addition;

import SubClasses.IMessage;

/**
 *
 * @author lenovo
 */
public abstract class Product extends Cafe implements IMessage{
    
   private static int total_product = 560;
   private int wait_time;
   private Addition add;

    public Product(int wait_time, int number, String date,int total) {
        super(number);
        this.wait_time = wait_time;
        add = new Addition(date,total);
     
    }

    
    public String setWaiting_time(int wait_time){
        
        return "\n ESTİMATED WAİT TİME: "+wait_time+"dk";
    }

  @Override
  public String message(){
     return "\nENJOY YOUR MEAL";
  }
  
  public String TotalProduct(int number){
        return "\n AMOUNT OF STORE: "+(total_product-number);
    }
    
  public abstract int getTotal(int number);
}
