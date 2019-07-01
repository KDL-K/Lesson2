import java.util.Scanner;
public class Menu{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int menu;
        do {
            do {
                System.out.println("\n\tList of actions");
                System.out.println("\t   Press 0-n:"); // n- number of menu item
                System.out.println("1. menu item.");
                System.out.println("2. menu item.");
                System.out.println("3. menu item.");
                System.out.println("4. menu item.");
                System.out.println("5. menu item.");
                //..........................
                System.out.println("n. menu item."); // n- number of menu item
                System.out.println("0. QUIT");
                System.out.print("Make your choice: ");
                menu=in.nextInt();
            } while (menu<0 || menu>n); //YOU have to put n - number of menu item
            switch (menu){
                case 0:
                    break;
                case 1: 
                    // some actions
                    break;
                case 2: {
                    // some actions
                    break;
                case 3:
                    // some actions
                    break;
                case 4:
                    // some actions
                    break;
                case 5:
                    // some actions
                    break;
             //........................................
                case n:          // n- number of menu item
                    // some actions
                    break;
                default:
                    // some actions
                    break;
              }
           }while (menu != 0);
           in.close();

     } 
}