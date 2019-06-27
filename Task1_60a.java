import java.util.Scanner;
public class Task1_60a{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Input a: ");
        int a=in.nextInt();
        System.out.print("Input b: ");
        int b=in.nextInt();
        System.out.print("Input c: ");
        int c=in.nextInt();
        System.out.println("a="+a+"   b="+b+"   c="+c);
        b=c;
        a=b;
        c=a;
        System.out.println("After changes:");
        System.out.println("a="+a+"   b="+b+"   c="+c);
    }
}