package src.app;

import java.util.Scanner;

public class order extends menu {
    private int NumOforder;
    private int Price;
    private int persons;
    private String TypeofOrder; 
      
    
    public order() {
        super();
        NumOforder = 1;
        persons =1;
        Price = 0;
        TypeofOrder = "Take a way";

    }

    public void setNumOforder(int num){
      
      // Writing to the file Ordernumber
    }

    
    public int getNumOforder(){

      // return the number in the file
      return NumOforder;
    }

    int Per;
    public void setTypeofOrder() {
      
      Scanner scnr = new Scanner(System.in);
      TypeofOrder = scnr.nextLine();    // exehand

      if (TypeofOrder.equals("Local")) {

        System.out.println("How many the persons for the order");

        persons = scnr.nextInt();      // exehand

      }

      if (!TypeofOrder.equals("Local")) {

              
        TypeofOrder = "Take a way";
      }
      Per = persons;

    }

    public String getTypeofOrder(){
      
      
      return TypeofOrder;
      
    }


    public int getpersons() {
      
      return Per;
    }


    
      

      public void WriteOutput() {
        super.WriteOutput();
        System.out.println( "Order number: " + getNumOforder());
        System.out.println("Order type: " + getTypeofOrder());
        System.out.println("Number of person: " + getpersons());
          
      }   
  
   
}