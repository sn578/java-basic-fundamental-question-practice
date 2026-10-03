// Calculate simple interest.

/*Formula

SI = (P × R × T) / 100

P = Principal → original amount
R = Rate → interest rate (%)
T = Time → time in years */
import java.util.*;
public class simpleintrest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double R = sc.nextDouble();
        double T = sc.nextDouble();

        double SI = (p * R * T) / 100;
        System.out.println("the si is : " + SI);
    }
}