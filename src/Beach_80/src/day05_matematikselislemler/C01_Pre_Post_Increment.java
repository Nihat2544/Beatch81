package Beach_80.src.day05_matematikselislemler;
// Pre Increment, Post Decrement
public class C01_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi1= 10;

        int sayi2= sayi1 +1; //sayi2 --->11

        sayi2 += 5; // sayi2 --> 16
        /*
        pre veya post increment veya decremenet
        sadece ++ ve -- işlemi için geçerlidir.
        bu iki işlem için sayıdan sonra veya önce yazılmasına göre farklı iki işleyiş olur.

         */

        int sayi3= sayi2++; //1-sayı2 değeri sayi3 e atanacak
                            //2-sayi2 1 artırılacak
        /*
        eğer ++ veya -- variable'dan sonra ise buna Post-Increment denir.
        Bu durumda o satırda yapılan iki işlemden öncelikli olan
        artırma veya azaltmadır.
        önce atayacak sonra da önceki sayıyı bir artıracak
         */

        System.out.println("sayi3 = " + sayi3); // 16
        System.out.println("sayi2 = " + sayi2); // 17

        int sayi4= ++sayi1; //1-sayi1 1 artırılacak
                            //2- sayı1 değeri sayi4 e atanacak
        /*
        eğer ++ veya -- variable'dan önce ise numa Pre-Increment denir.
        Bu durumda o satırda yapılan iki işlemden öncelikli olan artırma veya azaltmadır.
        Atadığı ile kendisi de aynı değeri alırlar.
         */
        System.out.println("sayi4 = " + sayi4); // 11
        System.out.println("sayi1 = " + sayi1); // 11


    }
}
