import java.util.ArrayList;
public class menu {
 // private  String [] Food = new String[7];
 // private String [] Drinks  = new String[4];
 private int Prices;
 private ArrayList<String> Food = new ArrayList<String>(10);
 private ArrayList<String> Drinks = new ArrayList<String>(10);

public menu() {
  //Food.add(null);
  //Drinks.add(null);
  Prices = 0;

}
/*public void printarreydrinks(){
  for(int i = 0; i<Drinks.length;i++){
    System.out.println(Drinks[i]+"\n");

}
}*/



public void setFood() {

  /* Food[0] = "1- Pizza           |30 SR|";
  Food[1] = "2- Meat Burger     |15 SR|";
  Food[2] = "3- Chicken Burger  |15 SR|";
  Food[3] = "4- Spaghetti       |20 SR|";
  Food[4] = "5- Nuggets         |7  SR|";
  Food[5] = "6- Steak           |25 SR|";
  Food[6] = "7- Salad           |5  SR|";*/

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
 
 /*  Drinks[0] = "1- Water       |1 SR|";
  Drinks[1] = "2- Seven Up    |3 SR|";
  Drinks[2] = "3- Pepsi       |3 SR|";
  Drinks[3] = "4- Orange Juice|5 SR|";*/

  Drinks.add("Water 1 SR");
  Drinks.add("Seven Up 3 SR");
  Drinks.add("Pepsi 3 SR");
  Drinks.add("Orange Juice 5 SR");

  System.out.println(Drinks);


  
     }

     public void printOut(){
      /*for(int i = 0; i<Food.length;i++){
      System.out.println(Food[i]+"\n");
      }*/
      
      System.out.println("     ||Food Menu||"+"\n");
      setFood();
      System.out.println("     ||Drinks Menu||"+"\n");
      setDrinks();
      
    }


     /* public void setprices(){
     
      for(int i =0; i<Drinks.length; i++){
          if(Drinks[i]=="Water" ) {
            Prices=1;
          } 
        
        
        if(Drinks[i]=="Seven Up") {
            Prices=3;
          } 
        
        
        if(Drinks[i]=="Pepsi" ) {
            Prices=3;
          } 
        
        
        if(Drinks[i]=="Orange Juice" ) {
            Prices=5;
          } 
        }
       
       
        for(int i =0; i<Food.length; i++){
        
          if(Food[i]=="Pizza" ) {
            Prices=30;
          } 
        
        if(Food[i]=="Meat Burger") {
            Prices=15;
          } 

        if(Food[i]=="Chicken Burger" ) {
            Prices=15;

          }  
        
        if(Food[i]=="Spaghetti" ) {
            Prices=20;
    
          } 
    
        if(Food[i]=="Nuggets") {
            Prices=7;
    
          } 
        
        if(Food[i]=="Steak" ) {
            Prices=25;
    
          } 
        
        if(Food[i]=="Salad" ) {
            Prices=5;

          } 
         
       }
    
      } */
      
    }    


    