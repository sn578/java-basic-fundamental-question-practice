//print 1 to n odd numbers 
public class question6{
    public static void main(String args[]){
        int counter = 1;
        int n = 20;
        while(counter <= n){
            if (counter % 2!=0){
               System.out.println(counter);
            }
            counter++;
        }
    }
}