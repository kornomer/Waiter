package projee;


import Abstract.Product;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
import SubClasses.*;
import SubClasses.Waiter;
import SubClasses.Desert;

public class SystemClass {
    
public static ArrayList<Waiter> gars=new ArrayList<Waiter>();


public static int i;



public static void addGarson(Waiter gar){
    
    gars.add(gar);
   
}


public String getAllGarson(){
    String result="";
    
    
    for(int i=0;i<gars.size();i++)
        //if(garsonlist.get(i) instanceof Garson){
            result+=gars.get(i).toString()+"\n";
            return result;
        }
    


  public void  removeGarson(Waiter gar){
    gars.remove(gar);
}

    public static ArrayList<Waiter> getWaiterlist() {
        return gars;
    }
  
  
  
  
  public String Display(){
      String result = "";
      for(int i=0; i<gars.size(); i++){
          result += "\n"+gars.get(i).toString();
      }
      return result;
  }
  


}
