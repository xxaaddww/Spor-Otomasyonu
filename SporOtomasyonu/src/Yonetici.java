import java.util.Scanner;

public class Yonetici  {
    Scanner scanner = new Scanner(System.in);
    private Calisanlar calisanlar;
    Yonetici yonetici;

    Yonetici(Calisanlar calisanlar) {


        this.calisanlar = calisanlar;
    }

    Yonetici() {

    }

    public void Bilgiler() {
        calisanlar.BilgiGoster("NURİ", "AKAT", 7500);

    }

    public void Zamlar() {
        calisanlar.ZamYap("NURİ", "AKAT", 7500);
    }

    public void EkleCikar() {
        calisanlar.PersonelEkle("NURİ","AKAT",7500);

    }
    public void PersonelMenu(){
        boolean deger = true;

        while (deger) {
            System.out.print("[1] - Depo Çalışanlarını Gör \n[2] - Market Çalışanlarını Gör\n[3] - Saha Çalışanlarını Gör\n[4] - ÇIKIŞ\n");

            System.out.println("Kararınız:");
            int secim = scanner.nextInt();
            switch (secim) {

                case 1:
                    yonetici = new Yonetici(new DepoCalisani("Nuri", "AKAT", 7500));
                    System.out.println("-----------------");
                    yonetici.DepoMenu();
                    break;
                case 2:
                    yonetici = new Yonetici(new MarketCalisani("eyüp", "deniz", 8900));
                    System.out.println("-----------------");
                    yonetici.MarketMenu();
                    break;
                case 3:
                    yonetici = new Yonetici(new SahaCalisani());
                    System.out.println("-----------------");
                    yonetici.SahaMenu();
                    break;
                case 4:
                    deger = false;
                    System.out.println("1-PERSONEL YÖNETİM \n" +
                            "2-HALISAHA\n" +
                            "3-DEPO\n" +
                            "4-MARKET\n" +
                            "5-ÇIKIŞ");
                    break;


            }
        }
    }

    public void DepoMenu() {
        Scanner scanner = new Scanner(System.in);

        boolean deger = true;

            System.out.print("< Gerçekleştirilecek İşlemler >\n-----------------\n[1] - Bilgi Göster \n[2] - Zam Yap \n[3] - Personel Ekle \n[4] - ÇIKIŞ \nKararınız:");
        while (deger) {
            System.out.println("Seçiminiz:");
            int kararVer = scanner.nextInt();
            switch (kararVer) {
                case 1:
                    System.out.println("-----------------");
                    Bilgiler();
                    System.out.println("-----------------");
                    break;
                case 2:
                    System.out.println("-----------------");
                    Zamlar();
                    break;
                case 3:
                    System.out.println("-----------------");
                    EkleCikar();
                    break;
                case 4:
                    deger=false;
                    break;
                default:
                    System.out.println("-----------------\n-> Tanımsız Bir Değer Girdiniz.\n-----------------");
                    break;
            }
        }
    }
    public void MarketMenu() {
        Scanner scanner = new Scanner(System.in);

        boolean deger = true;
        while (deger) {
            System.out.print("< Gerçekleştirilecek İşlemler >\n-----------------\n[1] - Bilgi Göster \n[2] - Zam Yap \n[3] - Personel Ekle \n[4] - ÇIKIŞ \nKararınız:");

            System.out.println("SEÇİMİNİZ: ");
            int kararVer = scanner.nextInt();
            switch (kararVer) {
                case 1:
                    System.out.println("-----------------");
                   Bilgiler();
                    System.out.println("-----------------");
                    break;
                case 2:
                    System.out.println("-----------------");
                    Zamlar();
                    break;
                case 3:
                    System.out.println("-----------------");
                    EkleCikar();
                    break;
                case 4:
                    deger=false;
                    break;
                default:
                    System.out.println("-----------------\n-> Tanımsız Bir Değer Girdiniz.\n-----------------");
                    break;
            }
        }
    }

    public void SahaMenu(){
        Scanner scanner = new Scanner(System.in);

        boolean deger= true;
        while (deger) {
            System.out.print("< Gerçekleştirilecek İşlemler >\n-----------------\n[1] - Bilgi Göster \n[2] - Zam Yap \n[3] - Personel Ekle \n[4] - ÇIKIŞ \n");

            System.out.println("Kararınız:");
            int kararVer = scanner.nextInt();
            switch (kararVer) {
                case 1:
                    System.out.println("-----------------");
                    Bilgiler();
                    System.out.println("-----------------");
                    break;
                case 2:
                    System.out.println("-----------------");
                    Zamlar();
                    break;
                case 3:
                    System.out.println("-----------------");
                    EkleCikar();
                    break;
                case 4:
                    deger=false;
                    break;
                default:
                    System.out.println("-----------------\n-> Tanımsız Bir Değer Girdiniz.\n-----------------");
                    break;
            }
        }
    }


}