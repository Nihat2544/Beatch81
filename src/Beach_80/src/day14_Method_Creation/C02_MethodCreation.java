package Beach_80.src.day14_Method_Creation;

import Beach_80.src.day13_MethodCreation.C04_MethodCreation;


public class C02_MethodCreation {
    public static void main(String[] args) {
        //Verilen 3 basamakli bir sayinin
        //rakamlari toplamini yazdiran bir method olusturalim


        int input = 789;
        rakamlarToplami(input);
        C04_MethodCreation.topla(6,7);
        C01_MethodCreation.terstenYazdir("Nuri");


    }







    public static void rakamlarToplami(int input) {

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp=input;

        birlerBasamagi= input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi= input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi= input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("Girdiginiz " +temp +" sayisinin rakamlar toplami :" + rakamlarToplami);

    }


}
