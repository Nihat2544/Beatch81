package Beach_80.src.day05_matematikselislemler;

public class C02_Pre_Post_increment {
    public static void main(String[] args) {

        int sayi = 10;
        System.out.println("pre-increment : "+ ++sayi); //11

        System.out.println("post-increment : "+ sayi++); //11

        System.out.println("post-increment'den sonra : " + sayi);

        sayi++;  //13

        ++sayi; //14



    }
}
