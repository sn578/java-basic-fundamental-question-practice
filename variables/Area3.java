//Calculate area of a rectangle
import java.util.*;
public class Area3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int Area = length * breadth;
        System.out.println("The area of rectangle = " + Area);
    }
}