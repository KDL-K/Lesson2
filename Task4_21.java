import java.util.Scanner;
public class Task4_21{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int menu;
        do {
            do {
                System.out.println("\tList of actions");
                System.out.println("\tPress 1-2:");
                System.out.println("1. To make task.");
                System.out.println("2. QUIT");
                System.out.print("Make your choice: ");
                menu=in.nextInt();
            } while (menu<1 || menu>2);
            switch (menu){
                case 1: 
                    System.out.println("Input b: ");
                    int b=in.nextInt();
                    System.out.println("Input a: ");
                    int a=in.nextInt();
                    if(b%a==0) System.out.printf("Число a(%d) является делителем числа b(%d)%n",a,b);
                    else System.out.printf("Число a(%d) не делитель числа b(%d)%n",a,b);
                    break;
                case 2:
                    break;
              }
           }while (menu != 2);
           in.close();

     } 
}