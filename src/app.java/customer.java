public class customer {

    private String Name;
    private int NumOfcusm;

    public customer()  {
        Name = "null";
        NumOfcusm = 0555555555;
    }

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
        System.out.print("0");
        return  NumOfcusm;
    }

    public void WriteOutput() {
        System.out.println(getName());
        System.out.println(getNumOfcusm());
    }
}