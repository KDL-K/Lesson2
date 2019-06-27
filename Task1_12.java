import java.util.Scanner;
public class Task1_12{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Please input 4 integer numbers:");
        System.out.print("t: ");
        int t=in.nextInt();
        System.out.print("v: ");
        int v=in.nextInt();
        System.out.print("x: ");
        int x=in.nextInt();
        System.out.print("y: ");
        int y=in.nextInt();
        System.out.println();
        System.out.println("а) 5 10        б) 100 "+t+"        в) "+x+" 25");
        System.out.println("   7 см           1949 "+v+"          "+x+" "+y);
        in.close();
    }
}