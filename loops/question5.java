// print 1 to n even number 
public class question5{
    public static void main(String args[]){
        int n = 10;
        int counter = 1;
        while (counter<= n){
            if(counter % 2 == 0){
                System.out.println(counter);
            }
            counter++;
        }
    }
}