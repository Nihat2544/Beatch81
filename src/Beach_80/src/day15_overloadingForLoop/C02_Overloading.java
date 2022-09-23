package Beach_80.src.day15_overloadingForLoop;

public class C02_Overloading {
    public static void main(String[] args) {
        /*
        Javada olusturdugumuz method'larin isminin yaptigi islerle uyumlu olmasini isteriz
        mesela bir String'in bir bolumunu almak icin Java
        substring() method'lari veya
        verilen String'deki bazi parcalari yenileri ile degistirmek icin
        2 adet replace() method'u var

        Java ayni isimde birden fazla method varsa
        hangisinin kullanilacagina parametre sayisi ve parametrelerin
         */
        String str="Bu Java ogrenilecek, baska yolu yok ";
        str.substring(2);
        str.replace('c', 'v');
        str.replace("J", "H");


        /*
        Ayni isimde ama farkli method'lari olusturmak icin
        1- parametre sayisi
        2- ayni sayida parametreye sahip olsa bile, parametrelerin data turleri
        3- ayni sayida ve ayni data turunde parametreleri olab methodlarda
        parametrelerin siralaisi
         */

    }
}
