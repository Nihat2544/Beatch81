package Beach_80.src.day17_nestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen string'i asagidaki gibi yazdiran bir program yazalim
        input= Deniz
        D
        De
        Den
        Deni
        Deniz
         */


        String input= "ankara";
        for (int i = 1; i <=input.length(); i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(input.substring(j-1,j));

            }
            System.out.println("");
        }
        for (int i = input.length()-1; i >=1; i--) {
            for (int j = i; j >= 1 ; j--) {
                System.out.print(input.substring(j-1,j));

            }
            System.out.println("");
        }

    }
}
