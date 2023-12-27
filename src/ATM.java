import java.util.Scanner;
public class ATM {
    public void calis(Hesap hesap){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamıza hoşgeldiniz....");

        System.out.println("*****************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("*****************************");
        int giriş_hakkı = 3;
        while (true){
            if (login.login(hesap)){
                System.out.println("Giriş Başarılı...");
                break;
            }
            else {
                System.out.println("Giriş Başarısız...");
                giriş_hakkı -= 1;
                System.out.println("Kalan Giriş Hakkı = " + giriş_hakkı);
            }
            if (giriş_hakkı == 0){
                System.out.println("Giriş Hakkı Bitti...");
                return;

            }
        }
        System.out.println("*****************************");
        String islemler = "1) Bakiye Görüntüle \n"
                + "2) Para Yatırma}\n" + "3) Para Çekme \n" +
                "Çıkış için q'ya basınız";
        System.out.println(islemler);
        System.out.println("*****************************");

        while (true){
            System.out.println("Yapmak istediğiniz İşlemi Seçiniz: ");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz : " + hesap.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.println("Yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.ParaYatır(tutar);
            } else if (islem.equals("3")){
                System.out.println("Çekmek istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.ParaCek(tutar);
            }
            else {
                System.out.println("Geçersiz İşlem...");

        }


        }




    }
}
