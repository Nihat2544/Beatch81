package Beach_80.src.day12_stringManipulation;

import java.util.Scanner;

public class C05_substring {
    public static void main(String[] args) {

        //kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        String input= "Kaya";

        String tersInput= input.substring(3)+
                          input.substring(2,3)+
                          input.substring(1,2)+
                          input.substring(0,1);
        System.out.println(tersInput);

        Scanner scan= new Scanner(System.in);

    }
}
