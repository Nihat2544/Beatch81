package Beach_80.src.day33_encapculation;

public class Tasit {

    private String tasitTuru;
    private boolean muayenesiVarmi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;

        // getter method'u da tek bir satirlik islem yapiyor
        // baska classalrin private oldugu icin eresemedigi
        // tasitTuru bilgisini, class iceresinden alip
        // istenen farkli class'lara return ediyor
    }

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
        //return olmadığı icin bu methodun cağırıldığı
        // tasitrunner classinden yazdirilamaz
        //burada bir satırlık islem yapıyor o bir satırlık islemde
        // bizim gönderdiğimiz parametreyi instence variable a atıyor.
    }

    public boolean isMuayenesiVarmi() {
        return muayenesiVarmi;

        //boolean variable'lar icin olusturulan getter method'larini ismi
        // isVariable ismi seklinde olur
    }

    public void setMuayenesiVarmi(boolean muayenesiVarmi) {
        this.muayenesiVarmi = muayenesiVarmi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
