import java.util.ArrayList;
import java.util.Scanner;
public class order extends menu {
    private int NumOforder;
    private int Price;
    private int persons;
    private ArrayList<String> registerOrder = new ArrayList<>();  
    
    
    
    public order() {
        super();
        NumOforder = 1;
        persons =1;
        Price = 0;

        //TODO Auto-generated constructor stub

    }

    public void setNumOforder(int num){
       num ++;
       NumOforder = num;
    }

    
    public int getNumOforder(){

        return NumOforder;
    }

    public void setpersons(int num) {
         persons = num;
    }

    public int getpersons() {
        return persons;
   }



    public void setpricesFoodandDrinks(){
        Scanner scnr = new Scanner(System.in);
        int Price = 0;
  
        System.out.println("Choosing the food and drinks");
        String f = scnr.nextLine();
  
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
        f = scnr.nextLine();
  
  }
  
  
  }


    
    
    



   
}