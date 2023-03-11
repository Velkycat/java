package com.velkycat;
import java.util.Scanner;

public class cip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: "); // ask for input

        char character; // character to parse input
        String string = scanner.next(); // input
        String reversed = ""; // reversed input

        for (int i=0; i<string.length(); i++) { // create integer i, while integer is less than input length - increase integer by 1
            character = string.charAt(i); // returns character at i
            reversed = character + reversed; // adds each character in front of reversed input
        }

        if (string.equals(reversed)) { // if input is the same as reversed input
            System.out.println(string + " is a palindrome"); // return true
        } else {
            System.out.println(string + " is not a palindrome"); // return false
        }
    }
}