import java.util.Scanner;
public class CalculateKDV {

    public static void main(String[] args) {

        //Create a scanner object
        Scanner input = new Scanner(System.in);

        double kdv1 = 0.18;
        double kdv2 = 0.08;

        //Request price from user
        System.out.print("Please enter a price:");
        double price = input.nextDouble();
        double kdv;
        
        if (price < 1000) {
            kdv = kdv1;
        } else {
            kdv = kdv2;
        }

        double kdvPrice = ((price * kdv) + price);

        System.out.println("Price: " + price);
        System.out.println("KDV: " + (price * kdv));
        System.out.println("KDV Price: "+kdvPrice);




    }
}
