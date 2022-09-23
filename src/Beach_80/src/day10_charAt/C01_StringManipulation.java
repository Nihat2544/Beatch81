package Beach_80.src.day10_charAt;

public class C01_StringManipulation {
    public static void main(String[] args) {
        String str= "Java ogrenmek ne guzel";

        System.out.println(str.charAt(0)); // ilk harfi yazdirir J

        System.out.println(str.toUpperCase().charAt(7)); // R

        System.out.println(str.charAt(21)); // l

        //System.out.println(str.charAt(22)); // sınırların dışında StringIndexOutOfBoundsException
        // son harfi bulma için str'in uzunluğunun 1 eksiğini index olarak gireriz

        // charAt() kullandığımızda sonuc char olacagı için artik manipulation yapamayız
        //String methodlarından kullanmamız gereken bir method varsa
        // charAt den önce kullanmalıyız


    }
}
