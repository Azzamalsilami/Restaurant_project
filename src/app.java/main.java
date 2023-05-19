import java.util.Scanner;
public class main{









    public static void main(String[] args) {

      Scanner scnr = new Scanner(System.in);

      customer cus = new customer();
  
      System.out.println("Name of customer");
      cus.setName(scnr.nextLine());

      System.out.println("Number phone of customer");
      cus.setNumOfcusm(scnr.nextInt());

      
      
      /**********************************************************/
      
      menu  menu = new menu();
    
      menu.printOutput();
      
      
      

      /**********************************************************/


      order ord = new order();
      ord.setAndgetTimeOfreserv();


      /**********************************************************/
      

      bill payBill = new bill();
   
}

}