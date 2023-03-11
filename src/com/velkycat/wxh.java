package com.velkycat;
import java.util.Scanner;

public class wxh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cost per square foot ($):");
        Float costPerTile = scanner.nextFloat();

        System.out.println("Width of room (ft):");
        Float width = scanner.nextFloat();

        System.out.println("Length of room (ft):");
        Float height = scanner.nextFloat();

        System.out.println("Cost of floor: $" + costPerTile * width * height);
    }
}