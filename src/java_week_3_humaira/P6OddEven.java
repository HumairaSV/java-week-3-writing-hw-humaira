package java_week_3_humaira;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class P6OddEven {

    public static void main(String[] args) {

        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int number = scanner.nextInt();
        P6OddEven oddEven = new P6OddEven();
        System.out.println(number + " is " + oddEven.isItEvenOrOddNumber(number) + " number");
        //Closing the scanner object
        scanner.close();

    }

    //Checking the odd or even
    public String isItEvenOrOddNumber(int number){
        if(number % 2 == 0){
            return "an Even";
        }else {
            return "an Odd";
        }
    }
}
