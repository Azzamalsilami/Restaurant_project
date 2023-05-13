import java.util.Arrays;
import java.util.Scanner;
public class main{









    public static void main(String[] args) {

      Scanner scnr = new Scanner(System.in);

      customer cus = new customer();
  
      System.out.println("Name of customer");
      cus.setName(scnr.nextLine());

      System.out.println("Number phone of customer");
      cus.setNumOfcusm(scnr.nextInt());

      cus.WriteOutput();
      
      
      
      menu  order1 = new menu(null, null, 0);
      order1.setFood();
      order1.setDrinks();
      
      System.out.println("     ||Food Menu||"+"\n");
      
      order1.printarreyfood();
      System.out.println("     ||Drinks Menu||"+"\n");

      order1.printarreydrinks();
   
}

}