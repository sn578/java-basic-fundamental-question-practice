// ternary operator 
// condition ? value1: value2;
import java.util.*;
public class question8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        String type = ((number %2)==0) ? "even" : "odd";
        System.out.println(type);
        
    }
}