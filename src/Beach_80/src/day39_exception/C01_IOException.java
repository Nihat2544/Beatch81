package Beach_80.src.day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Java dan bilgisayarimizdaki bir dosyaya erismek istiyorsak
        FileInputStream Class'indan yardim aliriz.
        Ayni sekilde java'dan bilgisayarimisdaki bir dosyaya
        ekleme veya update yapmak istersek
    FimeOutputStream Class'indan yardim aliriz
         */

        FileInputStream fis=new FileInputStream("src/Beach_80/src/day39_exception/Test.txt");
        

        /*
        Goruldugu gibi compile time'da altini kirmizi cizen her durum
        Compile Time Error degildir.
        Java da bazi exception'lar da
        Compile Time Exception'dir
        Ozellikle dosya okuma ve yazma ile ilgili exception'lar
        Compile Time Error'dir.


        Compile Time Exception olustugunda java cozum icin iki ihtimal onerir
        1- try-catch ile cevremek
        2- method signature'ina throws keyword ile beklenen exception
        turunu yazmak

        thows Exception, sadece olayin farkinda oldugumuzun deklarasyonudur
        exceqtion'un handle edilmesinde hicbir rolu yoktur
        Yani try catch ile kontrol altina aldigimiz exception'larda
        kod calismaya devam ediyordu
        Ancak throws Exceqtion yazdigimizda java bir exceqtion ile
        karsilasirsa hic bir sey yapmamisiz gibi hata mesaji yayinlayip
        calismayi durdurur.
         */
    }
}
