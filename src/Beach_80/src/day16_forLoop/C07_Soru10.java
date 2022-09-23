package Beach_80.src.day16_forLoop;

public class C07_Soru10 {
    public static void main(String[] args) {
        int sayi1 = 1;
        int sayi2 = 4;
        int toplam = 0;

        for (int i = sayi1; i <= sayi2 - sayi1 + 1; i++) {
            toplam += sayi1;
            sayi1++;
            System.out.println("toplam = " + toplam);


        }
    }
}




