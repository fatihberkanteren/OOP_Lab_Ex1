
public class Kasa {

    public Kasa() {
        System.out.println("Hoş geldiniz.");
        this.toplamSatisMiktari = 0;
        this.gunlukKar = 0;
        this.salataKar = 0;
        this.tatliSayisi = 0;
        this.salataSayisi = 0;
    }

    public Kasa(String isim) {
        System.out.println(isim + " -> Hoş geldiniz.");
        this.toplamSatisMiktari = 0;
        this.gunlukKar = 0;
        this.salataKar = 0;
        this.tatliSayisi = 0;
        this.salataSayisi = 0;
    }

    private int toplamSatisMiktari;
    private double gunlukKar;
    private double salataKar;
    private int tatliSayisi;
    private int salataSayisi;

    public void hesapla(int secim, double fiyat) {
        topSatHesapla(fiyat);
        gunlukKrHesapla(secim, fiyat);
    }

    private void topSatHesapla(double fiyat) {
        this.toplamSatisMiktari += fiyat;
    }

    private void gunlukKrHesapla(int secim, double fiyat) {
        switch (secim) {
            case 1:
                this.gunlukKar += fiyat * 0.3;
                salataKari(fiyat * 0.3);
                break;
            case 2:
                this.gunlukKar += fiyat * 0.25;
                break;
            case 3:
                this.gunlukKar += fiyat * 0.35;
                break;
            case 4:
                this.gunlukKar += fiyat * 0.20;
                tatliSayiArttir();
                break;
            case 5:
                break;
            default:
                System.out.println("Yanlış seçim");
                break;
        }
    }

    private void salataKari(double kar) {
        this.salataKar += kar;
    }

    private void tatliSayiArttir() {
        this.tatliSayisi++;
    }

    public void fisYazdir() {
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("Toplam satış miktarı : " + this.toplamSatisMiktari
                + "\nGünlük kâr miktarı : " + this.gunlukKar
                + "\nOrtalama salata kârı : " + this.salataKar
                + "\nTatlı sayısı : " + this.tatliSayisi);
        System.out.println();
        System.out.println("---------------------------------");
    }

}
