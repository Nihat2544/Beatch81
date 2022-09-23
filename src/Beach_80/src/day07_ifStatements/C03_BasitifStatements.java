package Beach_80.src.day07_ifStatements;

public class C03_BasitifStatements {
    public static void main(String[] args) {

        /*
        Bir if statement'da { kullanılmazsa java ilk satırı sart ile baglar
        Sonraki satırlar bagimsiz olur

        Eger bireden fazla satır ayni if sartina baglanmis ise mutlaka { kullanmaliyiz.
         */
        int sayi=-23;

        if(sayi>0)
            System.out.println("Sayi pozitif"); //değere bağli
            System.out.println("pozitif kalacaktır");//her zaman calisir
            System.out.println("Ucuncu satir");//her zaman calisir


        if (sayi%2==0)
            System.out.println("Sayi cift"); // değere bagli
            System.out.println("cift kalacaktır");//her zaman calisir


        if (sayi%5==0)
            System.out.println("Sayi 5'in tam katı");


    }
}
