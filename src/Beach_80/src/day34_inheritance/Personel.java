package Beach_80.src.day34_inheritance;

public class Personel {
    /*
    Eger parent class olacak sekilde tasarladiginiz
    bir class varsa veya ilerde bu calss'i parent yapmak isteyenler
    olabilir diyorsaniz variable ve method'larin a
    acces modifier'ini protected
     */

    protected int persNo;
    protected String isim = "Isim belirtilmedi";
    protected String departman = "Departman belirtilmedi";

    protected void maas(){
        System.out.println("Tum personelin maasi vardir :");
    }
    protected void mesai(){
        System.out.println("Tum personelin");
    }

    protected void fazlaMesaiUcreti(){
        System.out.println("personel fazla mesai:");
    }
}
