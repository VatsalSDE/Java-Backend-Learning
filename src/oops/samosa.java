package oops;

public class samosa {
//    properties
//    this all are the instance variables
    private String shape;
    private String color;
    private String type;
    private int price;

    // constructor
    public samosa (){
        shape="Triangle";
        color="Brown";
        type="Mattar";
        price=10;
    }
    // here the variables which are in the parameters of the constructor so they are the local variables

    public samosa(String sh , String col , String typ , int pri){
        this.shape=sh;
        this.color=col;
        this.type=typ;
        this.price=pri;
    }
//    behaviours
    public  void showDetails(){
        System.out.println("+++++++++++++++++++");
        System.out.println("Shape :- "+shape);
        System.out.println("color :- "+color);
        System.out.println("Type :- "+type);
        System.out.println("Price :- "+price);
        System.out.println("-------------------");
    }

}
