package Calculator;
// данный класс представляет собой собственное исключение, которое 
// выводит исключение (сообщение) в случае ошибки математического характера
public class InvalidInputException extends ArithmeticException{
    public InvalidInputException (String message){
        super(message);
    }
}
