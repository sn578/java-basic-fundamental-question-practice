//Print your name, age and college.
import java.util.*;
public class printage{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String collegename = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("Student details: " + name + ", " + collegename + ", " + age);

    }
}