import java.text.DecimalFormat;
import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {

        //variables
        final double pear = 2.14;
        final double apple = 3.67;
        final double tomatoes = 1.11;
        final double banana = 0.95;
        final double eggplant = 5;
        double total = 0;

        //config
        Scanner scanner = new Scanner(System.in);

        //inputs and calculate
        System.out.print("Armut Kaç Kilo: ");
        total = (pear * scanner.nextDouble());

        System.out.print("Elma Kaç Kilo: ");
        total = total + (apple * scanner.nextDouble());

        System.out.print("Domates Kaç Kilo: ");
        total = total + (tomatoes * scanner.nextDouble());

        System.out.print("Muz Kaç Kilo: ");
        total = total + (banana * scanner.nextDouble());

        System.out.print("Patlıcan Kaç Kilo: ");
        total = total + (eggplant * scanner.nextDouble());

        System.out.print("Toplam Tutar: " + new DecimalFormat("##.###").format(total)+" TL");
    }
}
