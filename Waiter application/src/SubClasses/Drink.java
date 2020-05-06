/*                
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubClasses;

import Abstract.*;

public class Drink extends Product{
    
  
    private int total_drink = 40;
    

    public Drink(int wait_time, int number, String date, int total) {
        super(wait_time,number,date,total);
        total_drink++;
        
      //  Adisyon adis = new Adisyon(tarih, tutar);
    }
    @Override
    public  int getTotal(int amount){
        return total_drink-amount-1;
    }

}
