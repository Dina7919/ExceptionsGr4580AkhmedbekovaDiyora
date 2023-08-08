package Task2;

import java.util.Scanner;

public class task2 {
    public static void negativeNumver(int number){
        if (number < 0){
            throw new NegativeNumberException("Число меньше нуля");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        negativeNumver(0);
        try{
            negativeNumver(number);
        } catch(NegativeNumberException e){
            System.out.println("Сработал метод, число меньше 0");
        }
    }
}
