package oops;

public class child extends Parent {
    String cycle="Hero Gear Cycle";

    @Override
    public void show(){
        System.out.println("The child car name is  are ");
        System.out.println(cycle);
    }
}
