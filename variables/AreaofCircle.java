//Calculate area of a circle.
import java.util.*;
public class AreaofCircle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        double area = (3.14 * r * r);
        System.out.println("The area of circle : " + area);
    }
}