package src.app;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {

 private ArrayList<String> Food = new ArrayList<String>();
 private ArrayList<String> Drinks = new ArrayList<String>(); 
 private ArrayList<String> registerOrder = new ArrayList<>();
 private int Total;

public menu() {

  
  for (String element : Food) {
   element = null;
  }

  for (String element : Drinks) {
    element = null;
   }

   for (String element : registerOrder) {
    element = null;
   }

   Total = 0;


}



public void setFoodandDrinks() {

  System.out.println("     ||Food Menu||"+"\n");

  Food.add("Pizza 30 SR");
  Food.add("Meat Burger 15 SR");
  Food.add("Chicken Burger 15 SR");
  Food.add("Spaghetti 20 SR");
  Food.add("Nuggets 7  SR");
  Food.add("Steak 25 SR");
  Food.add("Salad 5  SR");
  
  System.out.println(Food +"\n");

  System.out.println("     ||Drinks Menu||"+"\n");

  Drinks.add("Water 1 SR");
  Drinks.add("Seven Up 3 SR");
  Drinks.add("Pepsi 3 SR");
  Drinks.add("Orange Juice 5 SR");

  System.out.println(Drinks);
  
    
}

    
    public int getFoodandDrinks(){
        Scanner scnr = new Scanner(System.in);
        int Price = 0;
  
        System.out.println("Choosing the food and drinks");
        String f = scnr.nextLine();          // exehand
  
        while (!f.equals("")) {
  
          if (f.equals("Pizza")) {
            Price = Price + 30;
            registerOrder.add(f);
          }
  
          if (f.equals("Meat Burger")) {
            Price = Price + 15;
            registerOrder.add(f);
          }
  
          if (f.equals("Chicken Burger")) {
            Price = Price + 15;
            registerOrder.add(f);
          }
  
          if (f.equals("Spaghetti")) {
            Price = Price + 20;
            registerOrder.add(f);
          }
  
          if (f.equals("Nuggets")) {
            Price = Price + 7;
            registerOrder.add(f);
          }
  
          if (f.equals("Steak")) {
            Price = Price + 25;
            registerOrder.add(f);
          }
  
          if (f.equals("Salad")) {
            Price = Price + 5;
            registerOrder.add(f);
          }
  
          if (f.equals("Water")) {
            Price = Price + 1;
            registerOrder.add(f);
          }  
    
          if (f.equals("Seven")) {
            Price = Price + 3;
            registerOrder.add(f);
          }
    
          if (f.equals("Pepsi")) {
            Price = Price + 3;
            registerOrder.add(f);
          }
    
          if (f.equals("Orange Juice")) {
            Price = Price + 5;
            registerOrder.add(f);
          }
  
        System.out.println("Total price: " + Price + " SR");
        System.out.println(registerOrder);
        f = scnr.nextLine(); // exehand
  
  }
       Total = Price;

       return Price;
  
  }


     public void WriteOutput() {
      
      System.out.println("The orders: " + registerOrder);
      System.out.println("Total price: " + Total + " SR");
      
      
    }


}
   