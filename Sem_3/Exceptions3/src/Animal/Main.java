package Animal;
// Главный класс, в котором выполняется основная программа

public class Main {
    public static void main(String[] args) throws AnimalCareException {
        // Создаем объект животного
        Animal animal = new Animal();

        // Пытаемся накормить животное
        try {
            animal.eat();
        } 
        catch (EatingException e) {
            // Если животное не ест, ловим исключение EatingException
            // Выводим сообщение об ошибке
            System.out.println(e.getMessage());
            // Затем выбрасываем новое исключение AnimalCareException
            throw new AnimalCareException("Feeding failed", e);
        }
    }
}
