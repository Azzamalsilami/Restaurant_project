package src.app;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

public class bill extends order {

    private int Orderconfirmation;
    private int PrintTheBill;

    public bill(int numOforder, String typeofOrder) {
        super(numOforder, typeofOrder);
        //TODO Auto-generated constructor stub
    }

/**
Sets the value of the Orderconfirmation variable to the specified integer value.
@param o The integer value to which the Orderconfirmation variable should be set.
*/
    public void setOrderconfirmation(int o) {
        Orderconfirmation = o;
    }

    
    
/**
Sets the value of the printTheBill variable to the specified integer value.
@param p The integer value to set the printTheBill variable to.
*/
    public void setPrintTheBill(int p) {
        PrintTheBill = p;
    }



/**
Returns the order confirmation number.
@return the order confirmation number
*/
    public int getOrderconfirmation() {
        return Orderconfirmation;
    }



/**
Returns the value of the printTheBill variable.
@return the value of the printTheBill variable
*/
    public int getPrintTheBill() {
        return PrintTheBill;
    }



/**
Writes the output of the program to the console.
*/
    public void WriteOutput() {
        
        super.WriteOutput();
        if (Orderconfirmation == 1) {
            System.out.println("Order status: confirmed" );
        }
        else {
            System.out.println("Order status: unconfirmed" ); 
        }
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println(dtf.format(now)); 

    }

    
}
