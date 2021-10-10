import java.util.Scanner;

public class CalculateAreaForTriangle {
    public static void main(String[] args) {

        //variables
        double[] edges = new double[3];

        //config
        Scanner scanner = new Scanner(System.in);

        //input with user
        for (int i = 1; i <= edges.length; i++) {
            System.out.print(i + " Kenar: ");
            edges[i - 1] = scanner.nextDouble();
        }

        //calculate
        double u = ((edges[0] + edges[1] + edges[2]) / 2);
        double trianglePerimeter = 2 * u;
        double triangleArea = Math.sqrt(u * (u - edges[0]) * (u - edges[1]) * (u - edges[2]));

        System.out.println("Üçgenin Çevresi: " + trianglePerimeter);
        System.out.println("Üçgenin Alanı: " + triangleArea);
    }
}
