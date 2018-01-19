package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Record user's name
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your Name: ");
        String name = sc.nextLine();
        System.out.println();

        // Output Welcome Message
        System.out.println("Welcome " + name);
    }
}
