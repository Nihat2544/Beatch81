package Beach_80.src.day26_constructor;

public class Laptop {
    String marka = "Belirtilmemis";
    String ekranBoyutu = "Belirtilmemis";
    int fiyat;
    String mensei = "Belirtilmemis";



    public Laptop(String marka, String ekranBoyutu, int fiyat, String mensei) {
        this.marka = marka;
        this.ekranBoyutu = ekranBoyutu;
        this.fiyat = fiyat;
        this.mensei = mensei;
    }

    @Override
    public String toString() {
        return
                "marka : " + marka +
                        "\nekranBoyutu : " + ekranBoyutu +
                        "\nfiyat : " + fiyat +
                        "\nmensei : " + mensei;
    }

    public Laptop(String marka, String ekranBoyutu, int fiyat) {
        this.marka = marka;
        this.ekranBoyutu = ekranBoyutu;
        this.fiyat = fiyat;
    }

    public Laptop(String marka) {
        this();
    }
    public Laptop() {
        System.out.println("Patladi gitti");
    }


}
