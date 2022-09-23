package Beach_80.src.day21_Arrays;

import java.util.Scanner;

public class D03_SayiListedeVarMi {
    /*
        Soru 3- Kullanicidan aldiginiz bir sayinin, verilen array'de olup olmadigini
        kontrol edip, bize true veya false sonucu donen bir method olusturun.
         */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Listede aradiginiz sayiyi giriniz : ");
        int arananSayi = sc.nextInt();
        int[] sayilar={5,3,1,2,4,7,9,14,29};

        boolean sonuc = SayiListedeVarMi(sayilar,arananSayi);
        if(sonuc){
            System.out.println("Girilen sayi listede VAR");
        }else
            System.out.println("Girilen sayi listede YOK");

    }

    public static boolean SayiListedeVarMi(int[] sayilar, int arananSayi) {
        boolean sonucMethod = false;
        for (int i = 0; i < sayilar.length; i++) {
            if(sayilar[i]==arananSayi){
            sonucMethod = true;

        }
        }

        return sonucMethod;
    }
}
