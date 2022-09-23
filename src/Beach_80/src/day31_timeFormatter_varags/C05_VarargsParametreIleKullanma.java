package Beach_80.src.day31_timeFormatter_varags;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir(5,"Ali", "Ayse", "Ismail", "Emre", "Barboros");

    }
    /*
    Varargs teorik olaarak sonsuz sayida elemenet alabilir.
    Bir method'da parametre olarak varargs varsa
    varargs'in sinirlarini bilenilmesi icin
    parametrelerin sonuncusu olmalidir.
    Oncesinde farkli parametreler olabilir ama varargs'tan
    sonra parametre OLAMAZ.

    Bu kuraldan oturu bir method'da sadece bir tane varargs
    olabilir.
     */

    public static void enUzunKelimeyiYazdir(int kelimeSayisi, String... kelime) {

        String enUzunKelime = kelime[0];
        for (int i = 0; i < kelime.length; i++) {
            if (enUzunKelime.length() < kelime[i].length()) {
                enUzunKelime = kelime[i];
            }
        }
        System.out.println("enUzunKelime = " + enUzunKelime);

        System.out.println("veya for each ile");
        for (String each : kelime
        ) {
            if (each.length() > enUzunKelime.length()) {
                enUzunKelime = each;
            }
        }
        System.out.println("enUzunKelime = " + enUzunKelime);

    }
}

