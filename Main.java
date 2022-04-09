package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[] simbols = {'A', 'B', 'C', 'D', 'E', 'F'};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите  конвертацию:");
        System.out.println("1. из 10-ой в 16-ую");
        System.out.println("2. из 10-ой в 2-ую");
        System.out.println("3. из 2-ой в 10-ую");
        int select = scanner.nextInt();
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        String newNumber = "";

        if (select == 1){
            while(number > 0){
                int modulo = number % 16;
                if (modulo > 9){
                    newNumber = simbols[modulo - 10] + newNumber;
                }
                else {
                    newNumber = String.valueOf(modulo) + newNumber;
                }

                number = number / 16;
            }
            if (newNumber == ""){
                newNumber = "0";
            }
            System.out.println(newNumber);
        }
        else if (select == 2){
            while(number > 0){
                int modulo = number % 2;
                newNumber = String.valueOf(modulo) + newNumber;

                number = number / 2;
            }
            if (newNumber == ""){
                newNumber = "0";
            }
            System.out.println(newNumber);
        }
        else if (select == 3){
            int newNumber1 = 0;
            int power = 0;
            while(number > 0){
                int lastNumb = number % 10;
                newNumber1 += lastNumb * (int)Math.pow(2, power);
                number = number / 10;
                power += 1;
            }
            System.out.println(newNumber1);
        }

    }
}
