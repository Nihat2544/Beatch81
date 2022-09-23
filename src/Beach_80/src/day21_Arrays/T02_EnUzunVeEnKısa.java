package Beach_80.src.day21_Arrays;

public class T02_EnUzunVeEnKısa {
    //Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun
    public static void main(String[] args) {

        String[] kelimeler = {"Ahmet", "Mahmut", "Emre", "Sadullah"};
        enUzunOlanVeEnKisaOlab(kelimeler);


    }

    private static void enUzunOlanVeEnKisaOlab(String[] kelimeler) {
        String enKisaOlan = kelimeler[0];
        String enUzunOlan = kelimeler[0];
        for (int i = 0; i < kelimeler.length; i++) {
            if (enKisaOlan.length() < kelimeler[i].length()) {
                enKisaOlan=kelimeler[i];
            }
        }
        System.out.println("enKisaolan kelime = " + enKisaOlan);
        for (int i = 0; i < kelimeler.length; i++) {
            if (enUzunOlan.length() > kelimeler[i].length()) {
                enUzunOlan=kelimeler[i];
            }
        }
        System.out.println("En uzun olan kelime = " + enUzunOlan);


    }
}
