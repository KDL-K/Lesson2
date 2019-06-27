import java.util.Scanner;
public class Task1_25{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Input size of the side of a square: ");
        int side=in.nextInt();
        System.out.println("The perimetre of the square: " +(side*4));
        in.close();
    }
}