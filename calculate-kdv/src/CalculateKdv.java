import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateKdv {
    public static void main(String[] args) {

        //variables
        boolean kdv_status;
        double price;

        //config
        Scanner scanner = new Scanner(System.in);

        //input with user
        System.out.print("Tutar giriniz: ");
        price = scanner.nextDouble();

        //Calculating
        kdv_status = price < 1000 && price > 0;

        System.out.println("KDV'siz fiyat: " + new DecimalFormat("##.##").format(price));
        System.out.println("KDV'li fiyat: " +
                (kdv_status == true ? new DecimalFormat("##.##")
                        .format(price + (price * 0.18)) : new DecimalFormat("##.##").format(price + (price * 0.08))));
        System.out.println("KDV tutarı: " +
                (kdv_status == true ? new DecimalFormat("##.##")
                        .format(price * 0.18) : new DecimalFormat("##.##").format(price * 0.08)));
    }

}
