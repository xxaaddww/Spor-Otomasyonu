import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SahaCalisani implements Calisanlar{
    public int eski_maas;
    static int elemansayisi=0;



    Scanner scan=new Scanner(System.in);
    @Override
    public void BilgiGoster(String ad, String soyad, int maas) {
        System.out.println("Sistemimizde Kayıtlı Çalışanlar:");
        System.out.println("ADI:"+ad+ "\n"+"Soyadı: "+soyad+"\n"+"MAAŞI:"+maas);
    }

    @Override
    public void ZamYap(String ad, String soyad, int maas) {
        eski_maas=maas;
        System.out.println("Çalışana Zam Yapma Bölümüne Hoşgeldiniz...");
        System.out.print("Yapmak İstediğiniz Zam Oranını Giriniz:");
        int zamOrani=scan.nextInt();
        System.out.println(ad+" "+soyad+" "+"İsimli Çalışana %" + zamOrani + " oranda zam yapıldı.");
        maas+=(maas*zamOrani)/100;

        System.out.println("Eski Maaş: "+eski_maas+ " "+" Yeni Maaş:"+ maas);
    }

    @Override
    public void PersonelEkle(String ad, String soyad, int maas) {
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
        elemansayisi++;

    }
}
