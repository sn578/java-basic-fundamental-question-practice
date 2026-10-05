//Find greater of two numbers.
import java.util.*;
public class question4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : " );
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        // check both numbers of greater 
        if ( a > b ){
          System.out.println("a is greater then b ");
        } 
        else if( b > a){
            System.out.println("b is greater then a ");
        }
        else {
            System.out.println("both are equal ");
        }
    }
}