import java.util.Scanner;
public class main{









    public static void main(String[] args) {

      /******************************Class1 custmer******************************/

      Scanner scnr = new Scanner(System.in);

      customer cus = new customer();
  
      System.out.println("Name of customer");
      cus.setName(scnr.nextLine());

      System.out.println("Number phone of customer");
      cus.setNumOfcusm(scnr.nextInt());

      
      
      /******************************Class2 menu******************************/
      
      menu  menu = new menu();
    
      menu.printOutput();
      
      
      

      /******************************Class3 order******************************/


      order ord = new order();
      ord.setpricesFoodandDrinks();

      System.out.println("Would you like the order is a Take a way or a Local?");
      ord.setTypeofOrder();
      ord.getTypeofOrder();
      
      
      
       


      /******************************Class4 bill******************************/
      

      //bill payBill = new bill();
   
}

}