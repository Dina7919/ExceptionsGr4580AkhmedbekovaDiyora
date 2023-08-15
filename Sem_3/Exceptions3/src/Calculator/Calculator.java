package Calculator;

import java.util.Scanner;
// Данный класс выходит в качестве калькулятора и считает сложение, вычитание, умножение и деление
public class Calculator {
// метод выводит сумму чисел и исключение в случае переполнения типа double
public double summarize(double firstNum, double secondNum) {
    if (firstNum > Double.MAX_VALUE / secondNum) throw new InvalidInputException("Double type overflow");
    return firstNum + secondNum;
}
// метод выводит деление чисел и исключение в случае если второе число равно нулю
    public double divide(double firstNum, double secondNum) {
    if (secondNum == 0) throw new InvalidInputException("Divizion by zero not allowed");
    return firstNum / secondNum;
}
// метод выводит умножение чисел и исключение в случае переполнения типа double
public double multiply(double firstNum, double secondNum) {
    if (firstNum > Double.MAX_VALUE / secondNum) throw new InvalidInputException("Double type overflow");
    return firstNum * secondNum;
}
// метод выводит вычитание чисел и исключение в случае если второе число больше первого
public double subtract(double firstNum, double secondNum) {
    if (firstNum < secondNum) throw new InvalidInputException("Первое число меньше второго!");
        return firstNum - secondNum;
}


// данный класс представляет собой основной класс, где пользователь вводит числа и класс выводит результаты математических вычислений,
// а также проверяет число на исключение InvalidInput Exception
public static void main(String[] args) {
    Calculator calculator = new Calculator();
    PowerCalculator powerCalculator = new PowerCalculator();
    Scanner in = new Scanner("Введите первое число: ");
    int firstNum = in.nextInt();
    Scanner in2 = new Scanner("Введите второе число: ");
    int secondNum = in2.nextInt();
    try{
        System.out.println(calculator.summarize(firstNum, secondNum));
    }
    catch (InvalidInputException e){
        System.out.println("Произошла ошибка: " + e.getMessage());
    }
    try{
        System.out.println(calculator.divide(firstNum, secondNum));
    }
    catch (InvalidInputException e){
        System.out.println("Произошла ошибка: " + e.getMessage());
    }
    try{
        System.out.println(calculator.multiply(firstNum, secondNum));
    } 
    catch (InvalidInputException e){
        System.out.println("Произошла ошибка: " + e.getMessage());
    }
    try{
        System.out.println(calculator.subtract(firstNum, secondNum));
    } 
    catch (InvalidInputException e){
        System.out.println("Произошла ошибка: " + e.getMessage());
    }
    try{
        System.out.println(powerCalculator.calculatePower(firstNum, secondNum));
    }
    catch (InvalidInputException e){
        System.out.println("Произошла ошибка: " + e.getMessage());
    }
}
}
