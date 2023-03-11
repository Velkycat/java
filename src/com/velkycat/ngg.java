package com.velkycat;
import java.util.Scanner;
import java.util.Random;

public class ngg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(11);
        int i = 0;

        while (i != 3) {
            System.out.println("Enter guess: ");
            int guess = scanner.nextInt();
            if (guess > randomNumber) {
                System.out.println("Too high");
                i++;
            } else if (guess < randomNumber) {
                System.out.println("Too low");
                i++;
            } else {
                System.out.println("Correct! The number was " + randomNumber);
                return;
            }
        }
        System.out.println("The number was " + randomNumber);
    }
}
