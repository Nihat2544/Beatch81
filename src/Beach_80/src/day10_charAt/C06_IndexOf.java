package Beach_80.src.day10_charAt;

public class C06_IndexOf {
    public static void main(String[] args) {

        String str= "Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o"));// 5
        System.out.println(str.indexOf('g'));// 6

        System.out.println(str.indexOf("t")); // bana ınteger donduruyor : -1
                                             // aranan string'in str'da olmadigini soyler


        String str5= "wetyuio;lsdfgpoiuytrwsdfghjklp0oiuytwsdfghjkliuytrsdfghjk";

        //str5 'te p harfi var midir?
        if (str5.indexOf("p")==-1){
            System.out.println("str5'te istenen karakter kullanılmamıs");
        }else{
            System.out.println("str5'te istenen karakter kullanılmıstır");
        }


    }
}
