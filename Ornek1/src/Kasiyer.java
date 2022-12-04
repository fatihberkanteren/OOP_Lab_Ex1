
import java.util.Scanner;

public class Kasiyer {

    Kasa kasa;

    public Kasiyer() {
        this.kasa = new Kasa();
    }

    public Kasiyer(String isim) {
        this.kasa = new Kasa(isim);
    }

    public void isVakti() {
        Scanner input = new Scanner(System.in);
        int kod; 
        do {
            System.out.println("1) Salata\n2) Hamburger\n3) Pizza\n4) Tatlı\n5) Çıkış\n");
            System.out.println("Yemek kodunu giriniz : ");
            kod = input.nextInt();
            if (kod >= 5 ) {
                break;
            }
            System.out.println("Yemek fiyatını giriniz : ");
            double fiyat = input.nextDouble();
            kasa.hesapla(kod, fiyat);
        } while (kod != 5);

        kasa.fisYazdir();
    }
}
