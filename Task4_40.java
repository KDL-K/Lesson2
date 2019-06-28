import java.util.Scanner;
public class Task4_40{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int menu;
        do {
            do {
                System.out.println("\tList of actions");
                System.out.println("\tPress 1-2:");
                System.out.println("1. To make task. To calculate f(x).");
                System.out.println("2. QUIT");
                System.out.print("Make your choice: ");
                menu=in.nextInt();
            } while (menu<1 || menu>2);
            switch (menu){
                case 1: 
                    System.out.println("Input x: ");
                    double x=in.nextDouble();
                    if(x>=-2.4 && x<=5.7) System.out.println("f="+(x*x));
                    else System.out.println("f=4");
                    break;
                case 2:
                    break;
              }
           }while (menu != 2);
           in.close();

     } 
}