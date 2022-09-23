package Beach_80.src.day17_nestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen input'a gore
        *'lardan olusan asagıdaki sekli olusturun
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
         */

        //artan kismi nested for loop ile yapalim
        int input=7;

        for (int i = 1; i <=input ; i++) { // intour lopp

            for (int j = 1; j <=i ; j++) { //outour loop

                System.out.print("* ");

            }
            System.out.println("");
        }

        // azalan kismi ile        yapalim

        for (int i = input-1; i >=1 ; i--) { // intour lopp

            for (int j = i; j >=1 ; j--) { //outour loop

                System.out.print("* ");

            }
            System.out.println("");
        }



    }
}
