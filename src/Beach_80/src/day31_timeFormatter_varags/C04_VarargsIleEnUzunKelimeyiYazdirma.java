package Beach_80.src.day31_timeFormatter_varags;

public class C04_VarargsIleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {
        enUzunKelimeyiYazdir("Ali","Ayse","Ismail", "Emre", "Barboros");

    }

    public static void enUzunKelimeyiYazdir(String... kelime) {

        String enUzunKelime=kelime[0];
        for (int i = 0; i < kelime.length; i++) {
            if(enUzunKelime.length()< kelime[i].length()){
                enUzunKelime=kelime[i];
            }
        }
        System.out.println("enUzunKelime = " + enUzunKelime);

        System.out.println("veya for each ile");
        for (String each: kelime
             ) {
            if(each.length() > enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println("enUzunKelime = " + enUzunKelime);

    }
}
