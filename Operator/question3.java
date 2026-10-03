// find last digit of a number 
/*con is (n/10)use last digit remove form the numbers 
(n % 10 ) use find last digit of the number */

import java.util.*;
public class question3{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int lastDigit = n % 10;
        System.out.println("The last digit number is : " +  lastDigit);
    }
}