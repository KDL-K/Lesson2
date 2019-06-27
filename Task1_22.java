import java.util.Scanner;
public class Task1_22{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("y=7x*x-3x+6");
        System.out.print("Input x: ");
        double x=in.nextDouble();
        System.out.println("y=7*"+x*x+"-3*"+x+"+6="+(7*x*x-3*x+6));
        
        System.out.println("x=12a*a-7a-16");
        System.out.print("Input a: ");
        double a=in.nextDouble();
        System.out.println("a=12*"+a*a+"-7*"+a+"-16="+(12*a*a-7*a-16));
        in.close();
    }
}