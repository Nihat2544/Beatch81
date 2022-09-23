package Beach_80.src.day21_Arrays;

public class D01_Array_Ortalama {
    //Deneme1- Verilen bir array'deki sayilarin ortalamasini bulan bir method olusturun
    public static void main(String[] args) {
        double[] sayilar={5,7,3,1,9,11,12,1};
        ortalama(sayilar);
    }

    public static void ortalama(double[] sayilar) {
        double ortalama = 0;
        double toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
            ortalama=toplam/ sayilar.length;

        }
        System.out.println("Girilen sayilarin ortalamasi = " + ortalama);
    }
}
