package src.app;

import java.util.ArrayList;
import java.util.Scanner;

public class menu  {


private ArrayList<String> registerOrder = new ArrayList<>();
 private String food;
 private int Total;

 public menu() {
    
  for (String element : registerOrder) {
    element = null;
  }
  food = null;
  Total = 0;
   
  }




/**
Sets the food and drinks for the restaurant.
@param f The food and drinks to be set.
*/
public void setFoodandDrinks(String f) {

  Scanner scnr = new Scanner(System.in);

  int Price = 0;
  food = f;
  
                 
  
  while (!food.equals(" ")) {
  
          if (food.equals("Pizza")) {
            Price = Price + 30;
            registerOrder.add(food);
          }
  
          if (food.equals("Meat Burger")) {
            Price = Price + 15;
            registerOrder.add(food);
          }
  
          if (food.equals("Chicken Burger")) {
            Price = Price + 15;
            registerOrder.add(food);
          }
  
          if (food.equals("Spaghetti")) {
            Price = Price + 20;
            registerOrder.add(food);
          }
  
          if (food.equals("Nuggets")) {
            Price = Price + 7;
            registerOrder.add(food);
          }
  
          if (food.equals("Steak")) {
            Price = Price + 25;
            registerOrder.add(food);
          }
  
          if (food.equals("Salad")) {
            Price = Price + 5;
            registerOrder.add(food);
          }
  
          if (food.equals("Water")) {
            Price = Price + 1;
            registerOrder.add(food);
          }  
    
          if (food.equals("Seven")) {
            Price = Price + 3;
            registerOrder.add(food);
          }
    
          if (food.equals("Pepsi")) {
            Price = Price + 3;
            registerOrder.add(food);
          }
    
          if (food.equals("Orange Juice")) {
            Price = Price + 5;
            registerOrder.add(food);
          }
  
        System.out.println("Total price: " + Price + " SR");
        System.out.println(registerOrder);
        System.out.println("Select Space then press enter if you finish!");
        food = scnr.nextLine(); 
        Total = Price;
  
  }
  Total = Price;
    
}



/**
Returns an ArrayList of food and drink items available in the restaurant.
@return an ArrayList of food and drink items available in the restaurant.
*/
public ArrayList<String> getFoodandDrinks(){
        
return registerOrder;

}



/**
Writes the output of the program to the console.
*/
public void WriteOutput() {
      System.out.println("The orders: " + registerOrder);
      System.out.println("Total price: " + Total + " SR");
      
      
    }


}
   