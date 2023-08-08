// Вам необходимо создать пользовательский класс исключения "NegativeNumberException", 
// который будет выбрасываться , когда в метод передается отрицательное число.
// Класс "NegativeNumberException" должен содержать следующие методы:
// Конструктор: создайте конструктор с одним параметром типа String, 
// которое принимает сообщение об ошибке. Это сообщение будет выводиться при обработке исключения. 
// Метод getMessege: Создайте метод getMessage, который возвращает сообщение об ошибке, 
// переданное в конструкторе.
package Task2;

public class NegativeNumberException extends RuntimeException{
    //String message;
    public NegativeNumberException(String message){
        super(message);
    }
}
