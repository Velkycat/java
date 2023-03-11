package com.velkycat;
import java.util.Scanner;

public class cc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num = scanner.nextInt();
        long i = 0;

        while (num > 1) {
            if (num%2==0) {
                num = num/2;
            } else {
                num = num*3+1;
            } i++;
        }

        System.out.println(i);
    }
}