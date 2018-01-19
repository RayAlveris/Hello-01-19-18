package com.company;

import java.util.ArrayList;
import java.util.Random;
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

        //initialize ArrayList
        ArrayList<Integer>  absences = new ArrayList<>();

        // add random number of  absences based on length of names
        for (int i = 0; i < name.length(); i++) {
            Random rand = new Random();
            int num = rand.nextInt(11);
            absences.add(num);
        }

        // display element of the list
        System.out.println("The absences are: " + absences);
    }
}
