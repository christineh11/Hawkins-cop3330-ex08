/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Christine Hawkins
 */
import java.util.Scanner;


public class Main {

    public static void main(String [] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("How many people? ");
        int people= input.nextInt();

        System.out.println("How many pizzas do you have?");
        int pizza= input.nextInt();

        System.out.println("How many slices per pizza?");
        int slices= input.nextInt();
        int total= pizza*slices;

        System.out.printf("%d people with %d pizzas (%d slices)%n", people, pizza, total);


        int per= total/people;
        int leftover= total%people;


        System.out.printf("Each person gets %d pieces of pizza%n", per);

        System.out.printf("There are %d leftover pizzas%n", leftover);

    }
}

