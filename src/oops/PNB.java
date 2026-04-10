package oops;

public class PNB implements Bank{
    @Override
    public int GetRateOfInterest() {
        System.out.println("The rate of interest of PNB is "+10);
        return 10;
    }
}
