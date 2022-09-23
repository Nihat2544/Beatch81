package Beach_80.src.day02_variables;

public class C01_Variables {

    public static void main(String[] args) {

             int           not               =              55                ;
        //(data türü)  (variable ismi) (assignment sign)  (variable değeri)  (işlem değeri)

        int not2 = 70;
    //java önce değeri hesaplar sonra assign işlemini yapar


        // not2'yi 80 yapalım

        not2=80;

    // yeni bir int variable oluşturalım. değeri ilk iki variable'in ortalaması olsun

        int ort = (not + not2) /2;

        System.out.println(ort);
    // " " içerisinde yazılan herşey metindir. " " içinde ne görürse o şekilde yazdırır
    // Eğer bir variable' ın değerini yazdırmak istiyorsanız "" olmadan veriable'ın değerini yazmalısınız



    }
}
