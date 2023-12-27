public class Hesap {
    private String kullanıcı_adi;
    private String parola;
    private int bakiye;

    public Hesap(String kullanıcı_adi, String parola, int bakiye) {
        this.kullanıcı_adi = kullanıcı_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getKullanıcı_adi() {
        return kullanıcı_adi;
    }

    public void setKullanıcı_adi(String kullanıcı_adi) {
        this.kullanıcı_adi = kullanıcı_adi;
    }
    public void ParaYatır(int tutar){
        bakiye += tutar;
        System.out.println("Yeni bakiyeniz = " + bakiye);
    }
    public void ParaCek(int tutar){
        if (bakiye - tutar < 0){
            System.out.println("Talep ettiğiniz tutar bakiyenizden daha düşüktür!!!");
        }
        if (tutar > 1500){
            System.out.println("Bir günde 1500 tl'den fazla para çekemezsiniz!!!");
        }
        else{
            bakiye -= tutar;
            System.out.println("Yeni bakiyeniz = " + bakiye);
        }

    }
}