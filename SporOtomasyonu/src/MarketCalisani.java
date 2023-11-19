import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarketCalisani implements Calisanlar {

    static int elemansayisi=0;

Scanner scan=new Scanner(System.in);
    public MarketCalisani() {

    }



    public int getEskimaas() {
        return eskimaas;
    }

    public void setEskimaas(int eskimaas) {
        this.eskimaas = eskimaas;
    }

    int eskimaas;
    Scanner scanner=new Scanner(System.in);

    public MarketCalisani(String ad,String soyad,int maas) {
    }

    @Override
    public void BilgiGoster(String ad, String soyad, int maas) {

        System.out.println("Sistemimizde Kayıtlı Çalışanlar:");
        System.out.println("ADI:"+ad+ "\n"+"Soyadı: "+soyad+"\n"+"MAAŞI:"+maas);


    }

    @Override
    public void ZamYap(String ad, String soyad, int maas) {
        eskimaas=maas;
        System.out.println("Market Çalışanı Zam Yapma Ekranına Hoşgeldiniz");
        System.out.println("!!Bir Market Çalışanına % 20 den fazla zam yapamazsınız!!\n" +
                "Yapmak İstediğiniz Zam Oranını Giriniz: ");
        int girdi= scanner.nextInt();
        if(girdi>20){
            System.out.print("İşletme Kurallarına Aykırı Bir Zam Oranı Girdiniz Lütfen Yeniden Giriş Yapınız:");
            girdi= scanner.nextInt();

        } else {
            maas+=(maas*girdi)/100;
            System.out.println(ad+" "+soyad+" "+"İsimli Çalışana %" + girdi + " oranda zam yapıldı.");
            System.out.println("Eski Maaş: "+eskimaas+ " "+" Yeni Maaş:"+ maas);

        }

    }

    @Override
    public void PersonelEkle(String ad,String soyad,int maas) {

        List list = new ArrayList();
        System.out.println("Personel Ekleme Ekranına Hoşgeldiniz");
        System.out.println("Eklemek istediğiniz elemanın bilgilerini giriniz.");
        System.out.print("ADI:");
        ad= scan.nextLine();
        System.out.print("SOYADI:");
        soyad= scan.nextLine();
        System.out.print("MAAŞ:");
        maas= scan.nextInt();
        list.add(0,ad);
        list.add(1,soyad);
        list.add(2,maas);
        System.out.println("Personel Eklendi");
        System.out.println("PERSONEL ADI:"+ list.get(0));
        System.out.println("PERSONEL ADI:"+ list.get(1));
        System.out.println("PERSONEL ADI:"+ list.get(2));


        }


}

