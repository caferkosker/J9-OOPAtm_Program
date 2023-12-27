import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap){
        Scanner scanner = new Scanner(System.in);
        String kullanıcı_adi;
        String parola;

        System.out.println("Kullanıcı Adı : ");
        kullanıcı_adi = scanner.nextLine();
        System.out.println("Parola : ");
        parola = scanner.nextLine();

        if (hesap.getKullanıcı_adi().equals(kullanıcı_adi) && hesap.getParola().equals(parola) ){
            return true;

        }
        else {
            return false;
        }
    }
}
