package src.app;

import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileOutputStream;
import java.io.IOException;

public class order  {

    private int NumOforder;
    private int persons;
    private String TypeofOrder; 

    

    public order() {
      NumOforder = 1;
      this.persons = 1;
      TypeofOrder = null;
    }



    public order(int numOforder,int p, String typeofOrder) {
      NumOforder = numOforder;
      persons = p;
      TypeofOrder = typeofOrder;
    }


    
/**
@return the number of orders in the file
@throws Exception if an error occurs while reading or writing the file
*/
    public int printNumOforder(){
      
      try
      {
          File az = new File ("file.txt");
      
      
      if (az.createNewFile())
      {
          // System.out.println("File created " + az.getName());
      }
      else
      {
        //  System.out.println("File already exists.");
      }
      
      }
      
      catch (IOException e)
      {
          System.out.println("An error occurred.");
          e.printStackTrace();
      }
      
      try 
      {
     
      FileInputStream fis = new FileInputStream ("file.txt");
      int num = fis.read(); 
      num = num + 1;
      
      FileOutputStream fos = new FileOutputStream ("file.txt");
      fos.write((int) num);
      NumOforder = num;
      }
      catch (IOException e) 
      {
      System.out.println("Eror!");
      }

      
       
       return NumOforder;
    }



/**
Sets the type of order for the current order.
@param t The type of order to be set.
*/
    public void setTypeofOrder(String t) {
      
      

      TypeofOrder = t;    // exehand


      if (!t.equals("Local")) {

              
        TypeofOrder = "Take a way";
      }
      

    }




/**
Sets the number of persons in the class.
@param p The number of persons to be set.
*/

    public void setpersons(int p) {





        persons = p;      

    }



 /**
Returns the number of persons in the system.
@return the number of persons in the system
*/
    public int getpersons() {


      return persons;
    }




/**
Returns the type of order.
@return the type of order as a String
*/
    public String getTypeofOrder(){
      
      
      return TypeofOrder;
      
    }




/**
Prints the order number, order type, and number of persons for the order.
*/
    public void WriteOutput() {
        
        System.out.println("Order number: " + printNumOforder());
        System.out.println("Order type: " + getTypeofOrder());
        System.out.println("Number of persons: " + getpersons());
          
      }   
  
   
}