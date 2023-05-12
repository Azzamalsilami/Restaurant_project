import java.util.Arrays;
import java.util.Scanner;
public class main{

/* menu  order1 = new menu();
 * order1.setFood()
 * 
 */









    public static void main(String[] args) {

      Scanner scnr = new Scanner(System.in);

      customer cus = new customer();
  
      System.out.println("Name of customer");
      cus.setName(scnr.nextLine());

      System.out.println("Number phone of customer");
      cus.setNumOfcusm(scnr.nextInt());

      cus.WriteOutput();
      
      
      
      menu  order1 = new menu();

      order1.printarreyfood(Food);
      order1.printarreydrinks(Drinks);
      }
}