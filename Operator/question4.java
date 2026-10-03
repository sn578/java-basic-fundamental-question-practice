//Find sum of digits of a 3-digit numberS
import java.util.*;
public class question4{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 digit number = ");
        int n = sc.nextInt();
        int lastDigit = n % 10;
             n = n / 10;
        int middleDigit = n % 10 ; 
            n = n / 10 ; 
        int firstDigit = n;

        int sum = lastDigit + middleDigit + firstDigit;
        System.out.println("The sum of 3 digit is : " + sum );

    }
}