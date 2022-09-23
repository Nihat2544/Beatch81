package Beach_80.src.day17_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen input'a göre yıldızlardan olusan bir ucgen olusturun
        ornek ınput=4 ise
        *
        * *
        * * *
        * * * *

         */
        int input=9;

        for (int i = 1; i <=input ; i++) { // intour lopp

            for (int j = 1; j <=i ; j++) { //outour loop

                System.out.print("* ");

            }
            System.out.println("");
        }



    }
}
