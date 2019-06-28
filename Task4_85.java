import java.util.Scanner;
public class Task4_85{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int menu;
        do {
            do {
                System.out.println("\tList of actions");
                System.out.println("\tPress 1-2:");
                System.out.println("1. To make task. To calculate y(x).");
                System.out.println("2. QUIT");
                System.out.print("Make your choice: ");
                menu=in.nextInt();
            } while (menu<1 || menu>2);
            switch (menu){
                case 1: 
                    System.out.println("Input x: ");
                    int x=in.nextInt();
                    if(x<-1) System.out.println("õ="+x+"   y(x)=-1");
                    else if(x>-1) System.out.println("õ="+x+"   y(x)="+x);
                         else System.out.println("õ="+x+"   y(x)=1");
                    break;
                case 2:
                    break;
              }
           }while (menu != 2);
           in.close();

     } 
}