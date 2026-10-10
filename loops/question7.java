//print reverse number
public class question7{
    public static Void main (String args){
        int n = 10998;
        while(n > 0){
            int lastDigit = n % 10;
            System.out.println(lastDigit);
            n = n/10;
        }
        System.out.println();
    }
}