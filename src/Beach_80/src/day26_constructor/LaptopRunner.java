package Beach_80.src.day26_constructor;

public class LaptopRunner {
    public static void main(String[] args) {

        Laptop kucuk = new Laptop("MacBook", "14inch", 15000,"Amerika");
        System.out.println("kucuk = " + kucuk);


        System.out.println("***********___*********");
        Laptop orta = new Laptop("MacBook", "15inch", 15000);
        System.out.println("orta = " + orta);

        System.out.println("***********___*********");
        Laptop buyuk = new Laptop("MacBook");
        System.out.println("buyuk = " + buyuk);


    }
}
