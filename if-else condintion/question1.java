//Check positive, negative or zero.
import java.util.*;
public class question1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if(number>0){
            System.out.println("the number is positive");
        } else if(number<0){
            System.out.println("the number is negative");
        } else {
            System.out.println("the number is zero");
        }
    }
}