package com.company;
import java.util.Scanner;

public class Task5_3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int menu;
        do {
            do {
                System.out.println("\tList of actions");
                System.out.println("\tPress 1-5:");
                System.out.println("1. Show all integer numbers (from 25 to 30) one under another.");
                System.out.println("2. Show second degree of integer numbers from 10 to b (b>=10).");
                System.out.println("3. Show third degree of integer numbers from a to 50 (a<=50).");
                System.out.println("4. Show integer numbers from a to b (b>=a).");
                System.out.println("5. QUIT");
            } while (menu<1 || menu>5);
            switch (menu){

            }
        }while (menu != 5);

    }
}
