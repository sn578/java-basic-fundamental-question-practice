//Check eligible for voting.
import java.util.*;
public class question3{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter the candidate Age : ");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("candidate  can give vote :");

        }
        else {
            
            System.out.println("candidate not eligible :");
        }

    }

}