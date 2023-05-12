import java.util.Arrays;
public class menu {
private  String [] Food = new String[7];
 private String [] Drinks  = new String[4];
 private int Prices;

public menu() {

}
public void printarreydrinks(int[]drunkii){
  for(int i = 0; i<Drinks.length;i++){
System.out.println(Drinks[i]);

}
}

public void printarreyfood(int[]foody){
  for(int i = 0; i<Food.length;i++){
System.out.println(Food[i]);
  

  }
  
}
public void setFood(String F) {

  
  Food[0] = "Pizza";
    Food[1] = "Meat Burger";
    Food[2] = "Chicken Burger";
    Food[3] = "Spaghetti";
    Food[4] = "Nuggets";
    Food[5] = "Steak";
    Food[6] = "Salad";
  

    
}
public void setDrinks(String D){
 
  Drinks[0] = "Water";
    Drinks[1] = "Seven Up";
    Drinks[2] = "Pepsi";
    Drinks[3] = "Orange Juice";

  
     }
     public void setprices(){
     
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
    
      }
      
    }    


    