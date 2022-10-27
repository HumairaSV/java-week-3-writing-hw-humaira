package java_week_3_humaira;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class P12FindInputValue {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any character : ");
        char ch = scanner.next().charAt(0);
        //object creation
        P12FindInputValue inputValue = new P12FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        //closing the scanner object

    }

    //Find the input value is Alphabet, digit or symbol
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z')|| (ch >= 'A' && ch<='Z' )){
            System.out.println(ch + " is an ALPHABET.");
        }else if (ch >= '0' && ch <= '9'){
            System.out.println(ch + " is a DIGIT.");
        }else {
            System.out.println(ch + " is a SYMBOL.");
        }

    }
}
