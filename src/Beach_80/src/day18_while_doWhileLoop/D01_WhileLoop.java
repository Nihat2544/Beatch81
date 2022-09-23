package Beach_80.src.day18_while_doWhileLoop;

public class D01_WhileLoop {
    public static void main(String[] args) {

        /*
    Kullanicidan baslangic ve bitis harflerini alin
    ve baslangic harfinden baslayip bitis harfine biten
    tum harfleri buyuk harf olarak ekrana yazdirin.
    Kullanicinin hata yapmadigini farz edin
     */

        char ilkHarf='a';
        char sonHarf='k';

        char temp=ilkHarf;
        String buyult="";

        while(temp<=sonHarf){

            buyult=(temp+"").toUpperCase();
            System.out.print(buyult + " ");
            temp+=1;

        }

    }
}
