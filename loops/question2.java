//print number 1 to n by using the while loop 
import java.util.*;
public class question2{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        while(counter <= n ){
            System.out.println(counter + " ");
            counter++;
        }
        System.out.println();
    }
}