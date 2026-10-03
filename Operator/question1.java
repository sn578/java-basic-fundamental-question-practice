//Check result of arithmetic operators.
import java.util.*;
public class question1{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        int minus = a - b;
        int multiple = a * b;
        int divide =  a / b;
        int module = a % b;

        System.out.println("arithmetic operators : " + sum + "," + minus + "," + multiple + ","  + divide + "," + module);
    }
}