package Beach_80.src.day07_ifStatements;

public class C02_BasitifStatements {
    public static void main(String[] args) {

        int sayi=-23;

        if(sayi>0){
            System.out.println("Sayi pozitif");
        }

        if (sayi%2==0){
            System.out.println("Sayi cift");
        }

        if (sayi%5==0){
            System.out.println("Sayi 5'in tam katı");
        }

        /*
        Basit if cumleleri kodun parcalarindan bagimsizdir.
        Sadece bir sart kontrol eder, sart saglamiyorsa, if body calisir, yoksa calismaz.
        birden fazla basit if cumlesi varsa girilen sarta bagli olarak,
        tumunde if body'si calismayabilir
         */
    }
}
