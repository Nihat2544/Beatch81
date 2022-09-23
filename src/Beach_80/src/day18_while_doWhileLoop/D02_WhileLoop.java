package Beach_80.src.day18_while_doWhileLoop;

public class D02_WhileLoop {
    public static void main(String[] args) {

         /*
        Kullanicidan bir sayi alin
        ve bu sayinin rakamlari toplamini yazin
         */

        int sayi=12345;
        int temp=sayi;
        int rakamlarTop=0;
        int birlerBasamagi=0;


        while(temp>0){
            birlerBasamagi=temp%10;
            rakamlarTop+= birlerBasamagi;
            temp/=10;
        }
        System.out.println("Sayinin rakamlar toplami : " + rakamlarTop);

    }
}
