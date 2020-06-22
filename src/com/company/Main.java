package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter number of arrays: ");
        if (scanner.hasNextInt()) {
            count = scanner.nextInt();
            scanner.nextLine();

            int [] outputArray = obtainArray(count);
            if (outputArray == null) {
                System.out.println("Input invalid!");
            } else {
                System.out.println("The chosen arrays are " + Arrays.toString(outputArray));
                System.out.println("The lowest value in the array is " + minArray(outputArray));
            }
        } else {
            System.out.println("Invalid input!");

        }

    }
    public static int [] obtainArray (int theLength) {
        int [] lengthArray = new int [theLength];
        int arrayNumber = theLength;
        for (int i = 0; i < lengthArray.length; i++) {
            System.out.println("Enter digit " + arrayNumber + ":");
            if (scanner.hasNextInt()) {
                lengthArray[i] = scanner.nextInt();
                scanner.nextLine();
                arrayNumber--;
            } else {
                System.out.println("Invalid input!");
                break;
            }
        }
        return lengthArray;
    }
    public static int minArray (int [] theArray) {
        int MinValue = Integer.MAX_VALUE;
        for (int i = 0; i < theArray.length; i++) {
            int min = theArray[i];
            if (min < MinValue) {
                MinValue = min;
            }
        }
        return MinValue;
    }

}
