package Beach_80.src.day18_while_doWhileLoop;

public class C01_WhileLoop {
    /*
    Kullanicidan baslangic ve bitis harflerini alin
    ve baslangic harfinden baslayip bitis harfine biten
    tum harfleri buyuk harf olarak ekrana yazdirin.
    Kullanicinin hata yapmadigini farz edin
     */
    public static void main(String[] args) {

        char ilkHarf='f';
        char sonHarf='t';

        char temp=ilkHarf;
        String buyult="";

        while (temp<=sonHarf) {

            buyult=(temp+"").toUpperCase();
            System.out.print(buyult + " ");
            temp+=1;
        }
    }
}
