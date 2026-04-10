package Exception_Handling;

public class AgeInvalidException extends Exception{
    public AgeInvalidException(){
        super("Age invalid");
    }

    public AgeInvalidException(String message){
        super(message);
    }
}
