package oops;

public class BankMain {
    public static void main(String[] args) {
        System.out.println("Starting Bank Main App");

        Bank b1=new PNB();
        Bank b2 = new ICICI();

        b1.GetRateOfInterest();
        b2.GetRateOfInterest();

        Vikas v1=new Vikas();

        // so here we have provided the reference object of bank of PNB so this will give interset of the  PNB
        v1.GogetMoneyFromBank(b1);
    }
}
