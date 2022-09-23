package Beach_80.src.day38_exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {
        int a=1000;
        int b=50;
        int sayac=1;

        while (sayac<100) {
            /*
            try blogu yapmaya calsitigimiz ama risk oldugunu dusundugumuz
            islemleri yazmak icin kullanilir
            catch'den sonraki parantez kasilasmayi bekledigimiz exception
            turunu javaya soylemek icin kullanilir
            catch blogu :java'ya soyledigimiz exception (istinai durum) gercekelisres
            javanin yapmasini istedigimiz islem

            catch blogunun onundeki paranteze karsilasmayi bekledigimiz
            exception'u yaza biliri veya her turlu exception'da devreye
            girmesini istiyorsak tum exception'larin parent'i olan
            Exception yazabiliriz
             */

            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("payda 0 oldu, dikkatli ol");
            }

            b--;
            sayac++;

        }
    }
}
