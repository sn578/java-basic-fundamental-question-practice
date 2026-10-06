// check pass or fail by using the ternary operator
import java.util.*;
public class question9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String reportCard = marks >=33 ? "pass" : "fail";
        System.out.println(reportCard);
    }
}