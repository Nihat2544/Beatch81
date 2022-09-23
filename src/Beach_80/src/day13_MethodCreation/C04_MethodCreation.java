package Beach_80.src.day13_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {
        // input olarak verilen iki integer'i toplayip sonucunu
        //yazdiran bir method olusturun

        int input1=15;
        int input2=20;

    //    method 4 adimda olustulur
    //    1.adim method call
    //    2.adim argument eklenmesi gerekiyorsa ekleyelim
    //    eger method'un return type void'den farkli olacaksa
    //    bir variable olusturup, method call'u assign edelim

        topla(input1,input2);



    }

    public static void topla(int input1, int input2) {
        //3.adimda method deklerasyonunda degistirilmesi gereken
        // bolumleri degistir(access modifier, return Type vb..)
        //4. eger return type vaid disinda bir seyse return key word'u ve
        // donecek degeri hesaplamaliyiz
        System.out.println("Girilen iki sayinin toplami : " + (input1+input2));
    }

}
