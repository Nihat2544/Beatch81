package Beach_80.src.day24_TEKRARLAR;

public class C34_ForLoop {
    // 1 den 5 e kadar olan tamsayilari toplayalim
    // 10 dan 20 ye kadar olan sayilari toplayin
    // 30 dahil 50 dahil, aradaki cift sayilari toplayin
    // 1500 ile 1600 arasinda 7 ile bölünebilen sayilarin toplami
    public static void main(String[] args) {
        int toplam =0;

        for (int i = 1; i <=5 ; i++) {
            toplam += i;
        }
        System.out.println("toplam = " + toplam);

        System.out.println("");
        for (int i = 10; i <=20 ; i++) {
            toplam += i;
        }
        System.out.println("toplam = " + toplam);

        System.out.println("");
        for (int i = 30; i <=50 ; i++) {
            if(i%2==0){
                toplam += i;
            }

        }
        System.out.println("toplam = " + toplam);

        System.out.println("");
        for (int i = 1500; i <=1600 ; i++) {
            if(i%7==0){
                toplam += i;
            }

        }
        System.out.println("toplam = " + toplam);


    }
}
