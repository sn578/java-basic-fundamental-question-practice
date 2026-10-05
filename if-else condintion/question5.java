//Find greatest of three numbers.
import java.util.*;
public class question5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : " );
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Enter third number : ");
        int c = sc.nextInt();

        // check both numbers of greater 
         if (a >= b && a >= c) {
            System.out.println("Greater number is: " + a);
        } 
        else if (b >= a && b >= c) {
            System.out.println("Greater number is: " + b);
        } 
        else {
            System.out.println("Greater number is: " + c);
        }
    }
}