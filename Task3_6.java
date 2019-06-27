public class Task3_6{
    public static void main(String[] args){
        boolean X=false;
        boolean Y=false;
        boolean Z=true;
        System.out.println("X||Y&&!Z="+(X||Y&&!Z));
        System.out.println("!X&&!Y="+(!X&&!Y));
        System.out.println("!(X&&Z)||Y="+(!(X&&Z)||Y));
        System.out.println("X&&!Y||Z="+(X&&!Y||Z));   
        System.out.println("X&&(!Y||Z)="+(X&&(!Y||Z)));  
        System.out.println("X||(!(Y||Z))="+(X||(!(Y||Z))));
    }
}