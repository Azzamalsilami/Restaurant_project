import java.util.ArrayList;
public class menu {
 private ArrayList<String> Food = new ArrayList<String>();
 private ArrayList<String> Drinks = new ArrayList<String>(); 

public menu() {
  

}



public void setFood() {

  

  Food.add("Pizza 30 SR");
  Food.add("Meat Burger 15 SR");
  Food.add("Chicken Burger 15 SR");
  Food.add("Spaghetti 20 SR");
  Food.add("Nuggets 7  SR");
  Food.add("Steak 25 SR");
  Food.add("Salad 5  SR");
  
  System.out.println(Food +"\n");
  
    
}
public void setDrinks(){
 
 
  Drinks.add("Water 1 SR");
  Drinks.add("Seven Up 3 SR");
  Drinks.add("Pepsi 3 SR");
  Drinks.add("Orange Juice 5 SR");

  System.out.println(Drinks);


  
     }

     public void printOutput(){
      
      System.out.println("     ||Food Menu||"+"\n");
      setFood();
      System.out.println("     ||Drinks Menu||"+"\n");
      setDrinks();
      
    }


     
    



}
    



      
    


    