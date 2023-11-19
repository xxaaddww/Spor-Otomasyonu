import java.io.*;
import java.util.Scanner;

public class Depo extends Location {
    File dosya=new File("DEPO.txt");

     int kapasite=100;
     int reyon;



    public void DepoEkrani() throws IOException {
        Scanner scan = new Scanner(System.in);
        EkranaYaz("Depo Ekranına Hoşgeldiniz Hangi İşlemi Yapmak İstersiniz?\n" +
                "1-ÜRÜN EKLE\n" +
                "2-KAÇ ADET ÜRÜN OLDUĞUNU GÖSTER\n" +
                "3-KAPASİTE\n" +
                "4-ÇIKIŞ", true);
        boolean deger = true;
        while (deger) {
            System.out.print("Seçiminiz: ");
            int secim = scan.nextInt();
            switch (secim) {
                case 1:
                    UrunEkle();
                    break;
                case 2:
                    DepoOku();
                    break;
                case 3:
                    System.out.println("BOŞ REYON SAYISI= " +kapasite);
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


    public void UrunEkle() throws IOException {
        Scanner scan=new Scanner(System.in);
        EkranaYaz("",true);

        EkranaYaz("Eklemek İstediğiniz Ürünün İsmini ve Adetini Girin:",true);
        addurun=scan.nextLine();
        System.out.println("Ürün Başarılı Bir Şekilde Eklendi!");
        kapasite--;
        if(!dosya.exists())
            dosya.createNewFile();

        FileWriter yaz=new FileWriter(dosya,true);
        BufferedWriter veriyaz=new BufferedWriter(yaz);

        veriyaz.write(addurun);
        veriyaz.newLine();
        veriyaz.close();
        yaz.close();


    }
    private void DepoOku() throws FileNotFoundException {
        Scanner scan=new Scanner(System.in);
        scan=new Scanner(dosya);
        while (scan.hasNextLine()==true){

                EkranaYaz(  "--> "+scan.nextLine(),true);

        }
    }
    public void EkranaYaz(String message, boolean satir) {
        if (satir == true)
            System.out.println(message);
        else
            System.out.println(message);
    }



    }






