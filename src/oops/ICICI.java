package oops;

public class ICICI implements Bank {
    @Override
    public int GetRateOfInterest() {
        System.out.println("The rate of interest of ICICI is "+12);
        return 10;
    }
}
