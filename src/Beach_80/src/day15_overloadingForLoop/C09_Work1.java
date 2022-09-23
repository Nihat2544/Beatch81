package Beach_80.src.day15_overloadingForLoop;

public class C09_Work1 {
    public static void main(String[] args) {
        /*
        Soru1)
        Ekrana 10 kez "Java guzeldir" yazdirin
         */

        String input="Java guzeldir";
        onDefaYazdir(input);

        }

    public static void onDefaYazdir(String input) {
            String str="Java guzeldir";
        for (int i = 1; i <=10 ; i++) {
            System.out.println("input = " + str);


        }
    }

}

