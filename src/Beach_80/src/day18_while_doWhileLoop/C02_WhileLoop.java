package Beach_80.src.day18_while_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin
        ve bu sayinin rakamlari toplamini yazin
         */

        int input=543;

        int rakamlarToplami=0;
        int birlerBasamagi=0;
        int temp=input;

        while(temp>0){
            birlerBasamagi=temp%10;
            rakamlarToplami += birlerBasamagi;
            temp/=10;
        }
        System.out.println(input + " sayisinin rakamlar toplami : " +rakamlarToplami);

    }
}
