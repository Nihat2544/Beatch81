package Beach_80.src.day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {
        //Bir tamsayi, bir de char değişken oluşturun ve bunların toplamını yazdırın.

        int sayi = 10;
        char harf = 'a';
        String str = "banan";
        System.out.println(sayi+harf); // 10a değil 107 oldu
        System.out.println(sayi*harf);
        System.out.println(harf + 2);
        System.out.println(str + sayi + harf); //banana
        System.out.println("" + sayi + harf);  // "": String olmuş oldu.10a
        //char yeniHarf = harf+2;
    /*
    1- char data turu isleme girdiği değişkenin türüne göre farklı davranabilir
    eğer matematiksel işleme girdiğinde variable sayisal bir değerse sayı gibi davranır.
        sayi+harf sayı variable'ı int olduğundan harf variable'ı ascıı tablosundan 97 değerini kullanır.

        char yeniHarf = harf+2; java önce sağdaki işlemi yapar,
        sağda int + char görünce ascii değerini saonra atama işlemini yapmaya çalışır.
        char yeniHarf=99;
        bu atama java açısından kabul edilebilir değildir.
    2- str+harf); // banana String variable ' ı çok güçlüdür. Diğerlerini kendine benzetir
     */

    char deger = '1';
        System.out.println(deger + harf); // '1'+'a' ----> 49+97 = 146,

        char deg = 97;
        System.out.println(deg);



    }






}
