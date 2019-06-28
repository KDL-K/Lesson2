import java.util.Scanner;
public class Task4_5{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int menu,x;
        do {
            do {
                System.out.println("\tList of actions");
                System.out.println("\tPress 1-3:");
                System.out.println("1. To define y by x for task a).");
                System.out.println("2. To define y by x for task b).");
                System.out.println("3. QUIT");
                System.out.print("Make your choice: ");
                menu=in.nextInt();
            } while (menu<1 || menu>3);
            switch (menu){
                case 1: 
                    System.out.println("Input x: ");
                    x=in.nextInt();
                    System.out.println("y="+((x<2)?x:2));
                    break;
                case 2:
                    System.out.println("Input x: ");
                    x=in.nextInt();
                    System.out.println("y="+((x<3)?-x:-3));
                    break;
                case 3:
                    break;
              }
           }while (menu != 3);

     } 
}