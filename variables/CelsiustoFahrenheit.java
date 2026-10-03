//Convert Celsius to Fahrenheit.
import java.util.*;
public class CelsiustoFahrenheit{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the celsius ");
        double Celsius = sc.nextDouble();
        double Fahrenheit = (Celsius *9/5)+ 32;
        System.out.println("Fahrenheit: " + Fahrenheit);


    }

}