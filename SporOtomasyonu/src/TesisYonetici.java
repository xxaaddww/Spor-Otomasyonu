import java.io.IOException;
import java.util.Scanner;

public class TesisYonetici {
    Scanner scan = new Scanner(System.in);
    HalıSaha saha = new HalıSaha();
    Depo depo = new Depo();
    Market market = new Market();

    Yonetici yonetici = new Yonetici();
    Scanner scanner = new Scanner(System.in);


    public void start() throws IOException, IOException {
        EkranaYaz("SPOR TESİSİMİZE HOŞGELDİNİZ", true);
        EkranaYaz("GİRİŞ YAPMAK İSTEDİĞİNİZ BÖLÜMÜ SEÇİNİZ:", true);
        System.out.println("========================================");
        EkranaYaz("1-PERSONEL YÖNETİM \n" +
                "2-HALISAHA\n" +
                "3-DEPO\n" +
                "4-MARKET\n" +
                "5-ÇIKIŞ", true);

    boolean deger=true;
        while (deger) {
            System.out.print("SEÇİMİNİZ:");
             int secim = scan.nextInt();

            switch (secim) {
                case 1:
                    yonetici.PersonelMenu();
                    break;
                //fonksiyon yaz
                case 2:
                    saha.SahaBilgi();
                    break;
                case 3:
                    depo.DepoEkrani();
                    break;
                case 4:
                    market.MarketEkrani();
                    break;
                case 5:
                    deger=false;
                    System.out.println("1-PERSONEL YÖNETİM \n" +
                            "2-HALISAHA\n" +
                            "3-DEPO\n" +
                            "4-MARKET\n" +
                            "5-ÇIKIŞ");

            }


        }
    }

        public void EkranaYaz (String message,boolean satir){
            if (satir == true)
                System.out.println(message);
            else
                System.out.println(message);
        }

    }
