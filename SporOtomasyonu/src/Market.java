import java.io.*;
import java.util.Scanner;
public class Market extends Location{
        File dosya=new File("MARKET.txt");
    Scanner scan=new Scanner(System.in);

    public void MarketUrunleri() throws IOException {
        System.out.println("Market ürün ekleme ekranına hoşgeldiniz.");
        System.out.println("Eklemek istediğiniz ürünü giriniz");
        addurun=scan.nextLine();
        System.out.println("Ürün başarı ile eklendi.");
        if(!dosya.exists())
            dosya.createNewFile();

        FileWriter yaz=new FileWriter(dosya,true);
        BufferedWriter veriyaz=new BufferedWriter(yaz);

        veriyaz.write(addurun);
        veriyaz.newLine();
        veriyaz.close();
        yaz.close();
    }
    public void marketDeposu() throws FileNotFoundException {
        Scanner scan=new Scanner(System.in);
        scan=new Scanner(dosya);
        while (scan.hasNextLine()==true){

            System.out.println( "--> " +scan.nextLine());

        }

    }
    public Market() {
        super();

    }

    @Override
    void Satis() {

        System.out.print("Marketten Almak İstediğiniz Ürünü Yazınız:");
        String st=scan.nextLine();
        System.out.print("Miktarını Giriniz:");
        int miktar= scan.nextInt();
        setFiyat((int) (Math.random()*10));
        System.out.println("Ürünün birim fiyatı: "+ getFiyat());
        System.out.println("Ödeyeceğeniz Tutar: " + getFiyat()*miktar);

    }
    public void MarketEkrani() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Market Ekranına Hoşgeldiniz Hangi İşlemi Yapmak İstersiniz?\n" +
                "1-ÜRÜN EKLE\n" +
                "2-KAÇ ADET ÜRÜN OLDUĞUNU GÖSTER\n" +
                "3-Alışveriş Yap\n" +
                "4-ÇIKIŞ" );
        boolean deger =true;
        while (deger) {
            System.out.print("Seçiminiz: ");
            int secim = scan.nextInt();
            switch (secim) {
                case 1:
                    MarketUrunleri();
                    break;
                case 2:
                    marketDeposu();
                    break;
                case 3:
                   Satis();
                    break;
                case 4:
                    deger=false;
                    System.out.println("1-PERSONEL YÖNETİM \n" +
                            "2-HALISAHA\n" +
                            "3-DEPO\n" +
                            "4-MARKET\n" +
                            "5-ÇIKIŞ");
                    break;

            }

        }
    }
}