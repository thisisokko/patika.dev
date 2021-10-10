import java.util.Arrays;
import java.util.Scanner;

public class CalculateVKI {
    public static void main(String[] args) {

        //variables
        double height = 0;
        double weight = 0;
        double vki = 0;

        //config
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        height = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        weight = scanner.nextDouble();

        //calculate
        vki = (weight / (Math.pow(height, 2)));
        System.out.println("Vücut Kitle İndeksiniz: "+vki);
    }
}
