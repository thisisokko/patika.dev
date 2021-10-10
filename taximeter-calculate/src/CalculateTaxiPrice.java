import java.util.Arrays;
import java.util.Scanner;

public class CalculateTaxiPrice {
    public static void main(String[] args) {

        //variables
        final int openPrice = 10;
        double km = 0;
        final double perKmPrice = 2.20;
        final int minPrice = 20;
        double price = 0;
        boolean status;

        //config
        Scanner scanner = new Scanner(System.in);

        //inputs
        System.out.println("Mesafe (KM): ");
        km = scanner.nextDouble();

        //calculate
        price = openPrice + (perKmPrice * km);
        status = price > minPrice;
        System.out.println("Ödenecek tutar: "+(status == true ? price : minPrice));
    }
}
