import java.util.Arrays;
public class menu {
 private  String [] Food = new String[7];
 private String [] Drinks  = new String[4];
 private int Prices;

public menu(String f, String d, int p) {
  Food[0] = "null";
  Drinks[0] = "null";
  Prices = 0;

}
public void printarreydrinks(){
  for(int i = 0; i<Drinks.length;i++){
    System.out.println(Drinks[i]+"\n");

}
}

public void printarreyfood(){
  for(int i = 0; i<Food.length;i++){
System.out.println(Food[i]+"\n");
  
 
  }
  
}
public void setFood() {

  
  Food[0] = "1- Pizza           |30 SR|";
  Food[1] = "2- Meat Burger     |15 SR|";
  Food[2] = "3- Chicken Burger  |15 SR|";
  Food[3] = "4- Spaghetti       |20 SR|";
  Food[4] = "5- Nuggets         |7  SR|";
  Food[5] = "6- Steak           |25 SR|";
  Food[6] = "7- Salad           |5  SR|";
  

    
}
public void setDrinks(){
 
  Drinks[0] = "1- Water       |1 SR|";
  Drinks[1] = "2- Seven Up    |3 SR|";
  Drinks[2] = "3- Pepsi       |3 SR|";
  Drinks[3] = "4- Orange Juice|5 SR|";

  
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


    