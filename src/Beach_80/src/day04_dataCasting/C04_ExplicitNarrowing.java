package Beach_80.src.day04_dataCasting;

//Explicit Narrowing (Manuel Daraltma)
public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1= 132;
        
        byte sayi2= (byte) sayi1;
        /*
        Geniş data türündeki değeri dar data türündeki variable'a atamak isterseniz
        java sizin geniş data türündeki değerin dar datatürünün sınırlarına
        uyup uymayacağını çalıştırana kadar bilemez ama java risk almaz.
        Riski sıfıra indirmek için burada bir sorun olursa sorumluluğu kabul etmenizi
        bekler. Bunun için değerin önüne () içinde istediğimiz data türünü yazmamız yeterlidir

        Bu riski üstlendiğimizde, 3 durum oluşabilir:
        1- bizim değerimiz, dar kalıp değerlerine uygun olursa hiç bir kayıp olmadan cast olur.
        2- double bir sayıyı int'a cast etmek gibi durumlarda data kaybı yaşanabilir
        3- geniş kalıptan değeri dar kalıba koyduğunuzda sınırları aşan durumlarda veri başkalaşabilir.
         */

        System.out.println("sayi2 = " + sayi2);
    }
}
