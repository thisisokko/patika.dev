import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variables for lessons
        double mathematics, physics,
                chemical, turkish, history, music;
        boolean status;

        //For input
        Scanner scanner = new Scanner(System.in);

        //Note inputs with user
        System.out.print("Matematik notu: ");
        mathematics = scanner.nextDouble();

        System.out.print("Fizik notu: ");
        physics = scanner.nextDouble();

        System.out.print("Kimya notu: ");
        chemical = scanner.nextDouble();

        System.out.print("Türkçe notu: ");
        turkish = scanner.nextDouble();

        System.out.print("Tarih notu: ");
        history = scanner.nextDouble();

        System.out.print("Müzik notu: ");
        music = scanner.nextDouble();

        //Calculate avarage
        double avarage = (mathematics + physics + chemical + turkish + history + music) / 6;
        System.out.println("Ortalamanız: " + avarage);

        //Calculate status
        status = avarage >= 60;
        System.out.println("Durum: " + (status == true ? "Geçti" : "Kaldı"));
    }
}
