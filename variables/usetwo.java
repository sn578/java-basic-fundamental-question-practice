//ake two numbers and print sum, difference, product, quotient.
import java.util.*;
public class usetwo{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int difference = a - b;
        int production = a * b;
        int quotient = a / b ; 
        System.out.println("The two numbers : " + difference + " , " + production + " , " + quotient + ",");
    }
}