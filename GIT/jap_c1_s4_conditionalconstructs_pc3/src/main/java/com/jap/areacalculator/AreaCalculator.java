package com.jap.areacalculator;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option from list to calculate area of fence");
        System.out.println("1. Square area for the chickens");
        System.out.println("2. Circular area for ducks");
        System.out.println("3. Rectangular area for cows");
        System.out.println();
        // Input choice from user
        int choice =0;

        AreaCalculator areaCalculator = new AreaCalculator();
        // Call method to calculate area of fence according to user's choice
        areaCalculator.calculateAreaOfFence(choice);
    }

    // Function to calculate area of fence based on user's choice take user input for side of square,
    //radius of circle, length and breadth of rectangle and calculate the area.

    public void calculateAreaOfFence(int choice) {

    }
    }

