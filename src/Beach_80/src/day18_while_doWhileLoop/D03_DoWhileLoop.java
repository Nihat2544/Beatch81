package Beach_80.src.day18_while_doWhileLoop;

public class D03_DoWhileLoop {
    public static void main(String[] args) {
        /*
        1 'den 10'a kadar olan sayilari
        1) while ile
        2)do while ile yazdirin
         */
        int sayi=1;

        while(sayi<10){
            System.out.print(sayi + " ");
            sayi++;
        }
        System.out.println(" ");

        sayi=1;
        do{
            System.out.print(sayi + " ");
            sayi++;

        }while(sayi<10);


    }
}
