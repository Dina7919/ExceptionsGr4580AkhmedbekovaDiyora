package Animal;
// Класс AnimalCareException представляет собой пользовательское исключение,
// которое выбрасывается, когда уход за животным не удается
public class AnimalCareException extends Exception {
    // Конструктор принимает сообщение об ошибке и исходное исключение
    public AnimalCareException(String message, Throwable cause) {
        super(message, cause);
    }
}