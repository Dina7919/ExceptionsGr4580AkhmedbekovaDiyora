// Задача 1:
// Напишите программу, которая запрашивает у пользователя 
// число и проверяет, является ли оно положительным. 
// Если число отрицательное или равно нулю, 
// программа должна выбрасывать исключение InvalidNumberException 
// с сообщением "Некорректное число". 
// В противном случае, программа должна выводить сообщение
//  "Число корректно".

package HomeTask1;

import java.util.Scanner;

import Task2.NegativeNumberException;

public class homeTask1 {
    public static void invalidNumber(int number){
            if (number < 0 || number == 0){
            throw new InvalidNumberException("Некорректное число");
        } else{
            System.out.println("Число корректно");
        }
    }
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        invalidNumber(number);
    }
}
