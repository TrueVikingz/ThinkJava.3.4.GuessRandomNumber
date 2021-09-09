package com.company;

import java.util.Random;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Number;
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        System.out.println("Write a number between 1-100 (including both)");
        System.out.println("Can you guess what it is?");
        Number = in.nextInt();
        System.out.println("You wrote: " + Number);
        System.out.println("The number to guess was " + number);
        System.out.println("You were off by: " + Math.abs(Number - number));
    }
}
