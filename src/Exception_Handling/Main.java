package Exception_Handling;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s=sc.nextLine();
//        try{
//            int s = sc.nextInt();
//            System.out.println("Hi my name is "+s);
//        }
//        catch (InputMismatchException er){
//            System.out.println("Invalid Input");
//        }
        System.out.println("Enter your Age : ");

        try{
            int age = sc.nextInt();
            System.out.println("Your Age is "+age);

            if(age<18){
                throw new AgeInvalidException();
            }
        }
        catch(AgeInvalidException ex){
            System.out.println("Your Age is invalid");
        }
        catch(Exception ex){
            System.out.println("Invalid");
        }
    }
}
