import java.util.Scanner;

public class UserControl {
    public static void main(String[] args) {

        //variables
        String username, password;
        String tempPassword = "";
        String question = "";

        //config
        Scanner s = new Scanner(System.in);

        //inputs
        System.out.print("Kullanıcı Adı: ");
        username = s.nextLine();
        System.out.print("Şifre: ");
        password = s.nextLine();

        //business
        if (username.equals("patikadev") && password.equals("java123")) {
            System.out.println("Giriş Başarılı :)");
        } else {
            System.out.println("Kullanıcı Adı veya Şifre Hatalı !!!");
        }
        if (!password.equals("java123")) {
            System.out.print("Şifre Sıfırlamak İster misiniz? (Y/N): ");
            question = s.nextLine();
        }
        if (question.equals("Y") || question.equals("y")) {
            tempPassword = "java123";
            do {
                System.out.print("Yeni Şifre:  ");
                password = s.nextLine();
                if (password.equals(tempPassword)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            } while (password.equals(tempPassword));
            tempPassword = password;
        }
    }
}
