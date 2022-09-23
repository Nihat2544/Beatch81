package Beach_80.src.tekrarlar;

public class Forloop {
    public static void main(String[] args) {
         /*
        Verilen bir pozitif tamsayinin pozitif tam bolenlerini yazdiralim
         */
        int sayi=45;

        for (int i=1; i<=sayi; i++){
            if (sayi%i==0){
                System.out.print(i+ " ");
            }
        }

    }
}
