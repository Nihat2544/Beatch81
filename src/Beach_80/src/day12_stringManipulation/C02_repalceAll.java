package Beach_80.src.day12_stringManipulation;

public class C02_repalceAll {
    public static void main(String[] args) {

        String str= "1Bu2gu3n Ja*va- cok g3uz/el";

        // str'i Bugun Java cok guzel haline getirin
        // replaceAll method'undaki all'un amaı aynı özellikteki tüm karakterleri kapsamasıdır
        // butun sayilari sil
        // butun ozel karakterleri sil

        //tüm ozel karakterleri silelim dedigimizde space'ler de siliniyor
        // space'leri korumak icin en basta onlarin yerine cumlede bulunmayacak
        // bir string koyalim
        //"qazwsx"
        str=str.replace(" ","qazwsx");
        System.out.println(str);
        str=str.replaceAll("\\W","");
        System.out.println(str); // 1Bu2gu3nJavacokg3uzel

        str=str.replaceAll("\\d","");

        //istenmeyen ozel karakter ve sayilardan kurtulduk simdi space'leri geri getirelim

        str=str.replace("qazwsx"," ");
        System.out.println(str);// yeniden degistirdik
    }
}
