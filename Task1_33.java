import java.util.Scanner;
public class Task1_33{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Input the number of residents of the country: ");
        long residents=in.nextLong();
        System.out.print("Input the size of the country(km): ");
        long size=in.nextLong();
        System.out.println("Population per square kilometer: "+(residents/size));
    }
}