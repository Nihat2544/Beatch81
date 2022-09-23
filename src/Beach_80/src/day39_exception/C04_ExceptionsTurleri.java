package Beach_80.src.day39_exception;

public class C04_ExceptionsTurleri {
    public static void main(String[] args) throws InterruptedException {

        String str;
        /*
        System.out.println(str);
        Deger atanmasi yapmadan bir variable'i kullanmaya calisirsaniz
        Java Complile Time'du bunu farkeder ve size izin vermez
         */

        str=null;

       // System.out.println(str.length());
       // NullPointerException (Run Time Exception)

        Object obj="Java java java";
        Integer sayi= (Integer)obj;

        /*
        String str2="Hava Civa";
        Integer sayi2=str2;
        Java bazi casting islemlerine Comple time'da izin vermez

        Ancak bazen syntax uygun olabilir
        bu durumda java kodun calismanisina itiraz etmez
         */

        Thread.sleep(5000);

    }
}
