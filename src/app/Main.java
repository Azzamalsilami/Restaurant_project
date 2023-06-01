package src.app;

import java.util.Scanner;
import java.util.ArrayList;
    

public class Main {

  private static ArrayList<String> Food = new ArrayList<String>();
  private static ArrayList<String> Drinks = new ArrayList<String>();


    public static void main(String[] args) {

      Scanner scnr = new Scanner(System.in);

      //******************************custmer******************************

      customer cus = new customer();

 /**
Prints the name and phone number of a customer.
@param cus The customer object to retrieve information from.
@param scnr The scanner object to read user input from.
*/
      System.out.println("Name of customer");
      cus.setName(scnr.nextLine()); 

      System.out.println("Number phone of customer");
      cus.setNumOfcusm(scnr.nextInt()); 

      
      //******************************menu******************************
      
      menu men = new menu();
/**
Prints the food and drink menus to the console.
Adds the food and drink items to their respective lists.
Prompts the user to choose their food and drinks.
@param scnr Scanner object to read user input.
@param Food List of food items.
@param Drinks List of drink items.
@param men The restaurant menu object.
*/
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

      System.out.println("Choosing the food and drinks");

      men.setFoodandDrinks(scnr.nextLine());
      
      //******************************order******************************

      bill ord = new bill(0, null); 

/**
Prints a message to the console asking the user if they want to order a take-away or a local delivery.
Takes the user's input and sets it as the type of order for the Order object.
If the type of order is local, prompts the user to enter the number of persons for the order and sets it as the persons for the Order object.
*/

     System.out.println("Would you like the order is a Take a way or a Local?");
     ord.setTypeofOrder(scnr.nextLine());
     

     if (ord.getTypeofOrder().equals("Local")) {

      System.out.println("How many the persons for the order");
         
      ord.setpersons(scnr.nextInt());

     }
      
      //******************************bill******************************
      
/**
This code snippet is a Java program that prompts the user to confirm a request and print an invoice.
It first prints a message asking the user if they would like to confirm the request. It then reads an integer input from the user and sets it as the order confirmation value.
If the user confirms the request, it prints a message asking if they want to print the invoice. It then reads an integer input from the user and sets it as the print the bill value.
If the user wants to print the invoice, it calls the WriteOutput() method of the Customer, Menu, and Order classes to print their respective output.
*/

      System.out.println("If you would like to confirm the request press 1");
      ord.setOrderconfirmation(scnr.nextInt());
     
      
      
      if (ord.getOrderconfirmation() == 1) {

      System.out.println("If you want to print the invoice press 1");
           
      ord.setPrintTheBill(scnr.nextInt());
      

      if (ord.getPrintTheBill() == 1) {

        System.out.println("=======================================");

        cus.WriteOutput();
        men.WriteOutput();
        ord.WriteOutput();
          

        System.out.println("=======================================");
      }
  
      }
       
}

}