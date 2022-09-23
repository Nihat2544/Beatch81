package Beach_80.src.day26_constructor;

public class Patlican {

    String uretimYeri = "Bilinmiyor";
    String kimUretti = "Bilinmiyor";
    int uretimYili;
    String tohum = "Bilinmiyor";


    public Patlican(String uretimYeri, String kimUretti, int uretimYili, String tohum) {
        this.uretimYeri = uretimYeri;
        this.kimUretti = kimUretti;
        this.uretimYili = uretimYili;
        this.tohum = tohum;
    }

    @Override
    public String toString() {
        return
                "\nuretimYeri : " + uretimYeri +
                        "\nkimUretti : " + kimUretti +
                        "\nuretimYili : " + uretimYili +
                        "\ntohum : " + tohum;
    }

    public Patlican() {
    }

    public Patlican(String uretimYeri, int uretimYili) {
        this.uretimYeri = uretimYeri;
        this.uretimYili = uretimYili;
    }

    public Patlican(String uretimYeri, String kimUretti, String tohum) {
        this.uretimYeri = uretimYeri;
        this.kimUretti = kimUretti;
        this.tohum = tohum;

    }
}
