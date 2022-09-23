package Beach_80.src.day18_while_doWhileLoop;

import java.util.Scanner;

public class D05_DoWhileLoop {
    public static void main(String[] args) {
        /*
        19'dan 290' a kadar 9'un kati olan tamsayilari sayilari yazdirin
         */


        int bas = 19;
        int bitis = 290;
        int temp=bas;


        while (temp < bitis) {
            if (temp % 9 == 0) {
                System.out.print(temp + " ");

            }temp++;

        }
        System.out.println(" ");

        temp=bas;

        do {
            if (temp % 9 == 0) {
                System.out.print(temp + " ");

            }temp++;

        }while (temp < bitis) ;
    }
}
