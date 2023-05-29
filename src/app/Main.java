package src.app;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class Main {









    public static void main(String[] args) {

      /******************************Class1 custmer******************************/

      Scanner scnr = new Scanner(System.in);

      customer cus = new customer();
  
      System.out.println("Name of customer");
      cus.setName(scnr.nextLine());                   // exehand

      System.out.println("Number phone of customer");
      cus.setNumOfcusm(scnr.nextInt());               // exehand

      

      
      
      /******************************Class2 menu******************************/
      
      menu  menu = new menu();

      menu.setFoodandDrinks();
      
      
    
      
      
      
      

      /******************************Class3 order******************************/


      order ord = new order();

      ord.getFoodandDrinks();  
    
      System.out.println("Would you like the order is a Take a way or a Local?");
      ord.setTypeofOrder();
      
      
      
      
       


      /******************************the file of bill******************************/
      
          
       
      

       cus.WriteOutput();
       ord.WriteOutput();
       
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
       LocalDateTime now = LocalDateTime.now();  
       System.out.println(dtf.format(now)); 


       
       
       
   
}

}