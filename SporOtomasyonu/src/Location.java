public class Location {
   private String urun,oz1,oz2,oz3 ;
   private int adet,fiyat,miktar;
    String addurun;
    public Location(String urun, int adet, int fiyat, int miktar) {
        this.urun = urun;
        this.adet = adet;
        this.fiyat = fiyat;
        this.miktar = miktar;
    }

    public Location() {

    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public int getMiktar() {
        return miktar;
    }

    public String getOz1() {
        return oz1;
    }

    public void setOz1(String oz1) {
        this.oz1 = oz1;
    }

    public String getOz2() {
        return oz2;
    }

    public void setOz2(String oz2) {
        this.oz2 = oz2;

    }

    public String getOz3() {
        return oz3;
    }

    public void setOz3(String oz3) {
        this.oz3 = oz3;

    }

    public String getUrun() {
        return urun;
    }

    public void setUrun(String urun) {
        this.urun = urun;
    }

    public int getMiktar(double v) {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }
    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    void Satis()  {
        System.out.println("Satış Bölümüne Hoşgeldiniz");
    }
    public void BilgiYazdir(){



    }
}