package Beach_80.src.day11_indexOf;

public class C01_indexOf {
    public static void main(String[] args) {
         String str= "Java ogrenmek cok guzel";
         //Verilen bir string'de herhangi bir string veya char'ın ilk kullanıldığı
        //indeksi bize dondurur

        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("r"));//7
        System.out.println(str.indexOf("j"));//-1
        System.out.println(str.indexOf("e"));//8

        System.out.println(str.indexOf("mek"));//10
        //eger istedigimiz indeksten sonrasini kontrol etmek istersek
        // o zaman ayni method'u iki parametreli olarak kullanabiliriz

        System.out.println(str.indexOf("g",6));//yazılan index'den baslar
        System.out.println(str.indexOf("g",(6+1)));

        //yukaridaki str'da 2.ve 3. e nin indekslerini bulun
        //2.e'yi bulabilmek icin 1.e'nin indeksine ihtiyacım var
        int ilke= str.indexOf("e");
        int ikincie= str.indexOf("e", (ilke+1));
        System.out.println(str.indexOf("e",ilke+1));

        //eger 2. e varsa 3.e'nin olup olmadıgını
        //ve varsa indeksini yazdıralım

        if (ikincie == -1){
            System.out.println("Verilen str'da 2.e yok");
        }else{
            int ucuncue= str.indexOf("e", (ikincie+1));
            if (ucuncue== -1){
                System.out.println("Verilen str'da 3.e yok");
            }else{
                System.out.println("Verilen str'da 3.e 'nin index' " + ucuncue);
            }

        }

    }
}
