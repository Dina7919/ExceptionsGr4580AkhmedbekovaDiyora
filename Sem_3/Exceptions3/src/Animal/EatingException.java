package Animal;
// Класс EatingException представляет собой пользовательское исключение,
// которое выбрасывается, когда животное не хочет есть
public class EatingException extends Exception {
    // Конструктор принимает сообщение об ошибке
    public EatingException(String message) {
        super(message);
    }
}