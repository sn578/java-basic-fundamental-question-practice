import java.util.*;
public class Areas{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        // formula of side of square
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("the area of square is:" + area);
    }
}