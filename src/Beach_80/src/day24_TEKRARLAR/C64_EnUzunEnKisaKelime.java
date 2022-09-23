package Beach_80.src.day24_TEKRARLAR;

public class C64_EnUzunEnKisaKelime {
    //Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun
    public static void main(String[] args) {

        String str [] = {"Asel", "Reyyan", "Hello", "Emre", "Can", "Abdullah"};
        enUzunKelime(str);
        System.out.println("enUzunKelime(str) = " + enUzunKelime(str));
        enKisaKelime(str);
        System.out.println("enKisaKelime(str) = " + enKisaKelime(str));
    }

    public static String enKisaKelime(String[] str) {
        String kisa =str[0];
        for (int i = 0; i < str.length; i++) {
            if(kisa.length() > str[i].length()){
                kisa = str[i];
            }
        }
        return kisa;

    }

    public static String enUzunKelime(String[] str) {
        String uzun =str[0];
        for (int i = 0; i < str.length; i++) {
            if(uzun.length() < str[i].length()){
                uzun = str[i];
            }
        }
        return uzun;
    }
}
