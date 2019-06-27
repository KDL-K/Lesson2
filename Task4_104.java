package com.company;
import java.util.Scanner;

public class Task4_104 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int d;//Day of week
        do{
            System.out.print("Please input a number of week day (1-7): ");
            d=in.nextInt();
        }while (d<1||d>7);
        switch (d){
            case 1: System.out.println("Понедельник");
            break;
            case 2: System.out.println("Вторник");
            break;
            case 3: System.out.println("Среда");
            break;
            case 4: System.out.println("Четверг");
            break;
            case 5: System.out.println("Пятница");
            break;
            case 6: System.out.println("Суббота");
            break;
            case 7: System.out.println("Воскресенье");
        }
        in.close();
    }
}
