package src.app;

public class customer {

    private  String Name;
    private int NumOfcusm;

    
    public customer(String name, int numOfcusm) {
        Name = name;
        NumOfcusm = numOfcusm;
    }


    public customer() {
        Name = null;
        NumOfcusm = 0555555555;
    }

    
/**
Sets the name of the object to the specified string.
@param n The new name of the object.
*/
    public void setName(String n) {
        
        Name = n;
    }


/**
Sets the number phone of customers in the system.
@param num The number phone of customers to be set.
*/
    public void setNumOfcusm(int num) {
        
        NumOfcusm = num;
    }



/**
Returns the name of the object.
@return the name of the object
*/
    public String getName() {
        
        return Name;
    }


/**
Returns the number phone of customers in the system.
@return the number phone of customers in the system
*/

    public int getNumOfcusm() {

        return  NumOfcusm;
    }

    
/**
Writes the output of the program to the console.
*/
    public void WriteOutput() {

        System.out.println("Name of custmer: " + getName());
        System.out.println("phone Number: " + '0' + getNumOfcusm());
    }
}