import java.util.Scanner;

public class CalculateCircleZoneArea {
    public static void main(String[] args) {

        //variables
        final double PI = 3.14;
        double radius = 0;
        double centerAngleMeasure = 0;
        double area = 0;

        //config
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.print("Yarıçap: ");
        radius = scanner.nextDouble();

        System.out.print("Merkez Açı Ölçüsü: ");
        centerAngleMeasure = scanner.nextDouble();

        //calculate
        area = (PI * Math.pow(radius, 2) * centerAngleMeasure) / 360;
        System.out.print(radius + " yarıçaplı " + centerAngleMeasure + " merkez açı ölçülü daire diliminin alanı: " + area);
    }
}
