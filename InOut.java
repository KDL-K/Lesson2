import java.util.Scanner;

public class InOut{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Input a number: ");
        int num=in.nextInt();
        System.out.printf("Your number is:%d",num);
        in.close();
    }

}