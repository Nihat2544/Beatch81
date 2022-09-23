package Beach_80.src.tekrarlar;

public class Forloop2 {
    /*
        Soru 2)
        10 ile 30 arasindaki sayilari arasinda virgul kullanarak yazdirin
        */
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=30;

        for (int i = sayi1; i <=sayi2 ; i++) {
            if (i<sayi2){
                System.out.print(i+ ",");
            }else System.out.println(i);

        }
    }
}
