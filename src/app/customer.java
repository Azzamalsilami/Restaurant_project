package src.app;
import java.util.Scanner;
public class customer {

    private  String Name;
    private int NumOfcusm;

    public customer()  {
        Name = "null";
        NumOfcusm = 0555555555;
    }

    Scanner scnr = new Scanner(System.in);

    public void setName(String n) {
        
        Name = n;
    }

    public void setNumOfcusm(int num) {
        
        NumOfcusm = num;
    }

    public String getName() {
        
        return Name;
    }

    public int getNumOfcusm() {

        return  NumOfcusm;
    }

    public void WriteOutput() {

        System.out.println("Name of custmer: " + getName());

        System.out.println("Number phone of coustomer: " + '0' + getNumOfcusm());
    }
}