import java.util.Calendar;
import java.util.Scanner;

public  class HalıSaha extends Location {

    String rezervasyon;
    final int sahafiyati = 420;
    int gunsayisi;
    Scanner scan = new Scanner(System.in);
    Calendar takvim = Calendar.getInstance();

    public void SahaBilgi() {
        {



                    System.out.println("HALISAHA BÖLÜMÜNE HOŞGELDİNİZ\n" +
                            "BURADAN SAHA HAKKINDA BİLGİ ALABLİR VE REZERVASYON YAPABİLİRSİNİZ");
                    System.out.println("=========================================================");
                    System.out.println("Yapmak istediğiniz işlem nedir?\n" +
                            "1-SAHA ÖZELLİKLERİ\n" +
                            "2-REZERVASYON İŞLEMLERİ\n" +
                            "3-Çıkış");
                    boolean deger=true;
                    while (deger){
                    System.out.print("Seçiminiz:");
                    int secim = scan.nextInt();
                    switch (secim) {
                        case 1:
                            BilgiYazdir();
                            break;
                        case 2:
                            Satis();
                            break;
                        case 3:
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


    @Override
    void Satis() {
        System.out.println("Şu Tarihten İtibaren Rezervasyon Yapabilirsiniz: " + (takvim.get(Calendar.MONTH) + 1) + "-"
                + takvim.get(Calendar.DATE) + "-" + takvim.get(Calendar.YEAR));
        setFiyat(sahafiyati);
        System.out.println("Kaç Günlük Rezervasyon Yapmak İstiyorsunuz:");
        gunsayisi = scan.nextInt();
        System.out.println("Rezervasyon Yaptığınız Tarih Aralığı: "+(takvim.get(Calendar.MONTH) + 1) + "-"
                + takvim.get(Calendar.DATE) + "-" + takvim.get(Calendar.YEAR) + "--"+(takvim.get(Calendar.MONTH) + 1) + "-"
                + (takvim.get(Calendar.DATE)+gunsayisi) + "-" + takvim.get(Calendar.YEAR));
        System.out.println("ÖDEMENİZ GEREKEN ÜCRET:" + getFiyat() * gunsayisi + "TL");

    }

    public void BilgiYazdir() {
        System.out.println("Halısahanın Özellikleri\n" +
                "-->İki Takım İçin Ayrı Soyunma Odaları Mevcuttur\n" +
                "-->Saha Zemini Çim Sıklığı Futbol Oynamaya Elverişlidir.\n" +
                "-->Sahamızın Yanında Bir Kapalı Otopark Bulunmaktadır.\n" +
                "-->Kaleler Standart Futbol Kurallarına Uygun Ölçülere Sahiptir.\n" +
                "-->Oynanan Maçların İzlenebileceği Bir Tribün Mevcuttur.\n");

    }


}
