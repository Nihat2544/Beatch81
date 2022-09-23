package Beach_80.src.day32_stringBuilder;

public class C05_indexOf_lastIndexof {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Pay attention please");

        System.out.println(sb.indexOf("Pay"));// 0

        System.out.println(sb);// Pay attention plase

        System.out.println(sb.indexOf("e"));// 7

        System.out.println(sb.indexOf("a",10));// 16

        System.out.println(sb.lastIndexOf("e"));// 19

        System.out.println(sb.lastIndexOf("e",10));// 7


    }
}
