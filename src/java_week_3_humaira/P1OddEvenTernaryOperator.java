package java_week_3_humaira;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class P1OddEvenTernaryOperator {

    public static void main(String[] args){
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
        //closing the scanner object
        scanner.close();

   }

   //Checking the number is even or odd
    public static void isItOddOrEvenNumber(int number){
        //using ternary operator (condition) ? exprIfTrue : exprIfFalse
        String evenOrOdd = (number%2 == 0)? "Even":"Odd";
        System.out.println(number + " is an " + evenOrOdd + " number");
    }
}
