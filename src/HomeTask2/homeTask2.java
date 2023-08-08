// Задача 2:
// Напишите программу, которая запрашивает у пользователя 
// два числа и выполняет их деление. 
// Если второе число равно нулю, программа должна 
// выбрасывать исключение DivisionByZeroException 
// с сообщением "Деление на ноль недопустимо". 
// В противном случае, программа должна выводить результат деления.

package HomeTask2;

import java.util.Scanner;

import Task3.NegativeSquareRootException;

public class homeTask2 {
        public static double divisionByZeroException(double a, double b){
        if(b == 0){
            throw new DivisionByZeroException("Деление на 0 недопустимо");
        }
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println("Введите делимое: ");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Введите делитель: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println(divisionByZeroException(a, b));
    }
}
