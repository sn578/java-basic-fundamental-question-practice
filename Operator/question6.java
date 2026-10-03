//  Calculate total bill with GST.

public class question6 {
    public static void main (String args[]){
        double amount = 4000;
        double Gst = amount * 1.18 ;
        double totalbill = Gst + amount; 

        System.out.println("The  amount Gst : " + Gst);
        System.out.println("The total bill: " + totalbill);
    }
}