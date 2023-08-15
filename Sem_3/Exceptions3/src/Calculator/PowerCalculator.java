package Calculator;
// данный класс высчитывает возведение чисел в степень и выводит исключение в случае если второе число отрицательное или равен нулю
public class PowerCalculator {
    public double calculatePower(double firstNum, double secondNum) {
        if (secondNum < 0 || secondNum == 0) throw new InvalidInputException("степень отрицательная или равно нулю!");
        return Math.pow(firstNum, secondNum);
    }
}
