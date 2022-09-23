package Beach_80.src.day26_constructor;

public class Ogretmen {
    String isim="Isim belirtilmei";
    String soyIsim="Soyisim belirtilmei";
    String dogumTarihi="Tarih belirtilmei";
    String brans="Brans belirtilmei";
    String yanBrans="Yanbrans belirtilmei";

    public Ogretmen() {
    }

    public Ogretmen(String isim, String soyIsim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public Ogretmen(String isim, String soyIsim, String dogumTarihi) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return
                "\nisim : " + isim  +
                "\nsoyIsim : " + soyIsim +
                "\ndogumTarihi : " + dogumTarihi +
                "\nbrans :" + brans +
                "\nyanBrans : " + yanBrans;

    }

}
