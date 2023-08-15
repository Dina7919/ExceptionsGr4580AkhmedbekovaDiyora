package Animal;
// Базовый класс Animal с методом eat()

public class Animal {
    // Метод eat() может выбросить исключение EatingException
    public void eat() throws EatingException {
        // С 50% вероятностью животное не захочет есть
        if (Math.random() < 0.5) {
            // В таком случае выбрасывается исключение EatingException  
            throw new EatingException("Animal is not eating");
        } else {
            // Если животное ест, выводится соответствующее сообщение
            System.out.println("Animal is eating...");
        }
    }
}
