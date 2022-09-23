package Beach_80.src.day18_while_doWhileLoop;

public class W02_WhileSoru2 {
    public static void main(String[] args) {
    // For loop ve while loop kullanarak 3 basamakli sayilardan 15, 20 ve 90'a tam
    // tam bolunebilen sayilari yazdirin

    int bas=100;
    int bitis=1000;
    int sayi=bas;

        for (int i = bas; i < bitis ; i++) {
            if(i%180==0){
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        sayi=bas;
        while(sayi<bitis){
            if(sayi%180==0){
                System.out.print(sayi + " ");
            }sayi++;
        }



    }
}
