package Beach_80.src.day18_while_doWhileLoop;

public class W01_WhileSoru1 {
    public static void main(String[] args) {

        //While loop kullanarak 3 den 13 e kadar tum tek sayilari yazdirin

        int bas=3;
        int bitis=13;
        int sayi=bas;
        while(sayi<bitis){
            if(sayi%2!=0){
                System.out.print(sayi + " ");

            }sayi++;
        }


    }
}
