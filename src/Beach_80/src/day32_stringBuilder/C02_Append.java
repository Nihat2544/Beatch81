package Beach_80.src.day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java daha ne yapsin");

        sb.append(" ?");

        System.out.println(sb);// Java daha ne yapsin ?

        // append istedigimiz String'i en sona ekler

        sb.append("Java",2,4);
        System.out.println(sb);// Java daha ne yapsin ?va

        sb.insert(4,"her seyi dusunmus,");
        System.out.println(sb);// Javaher seyi dusunmus, daha ne yapsin ?

        // araya ekleme yapmak istedigimiz de append degil insert kullanmaliyiz

        sb.insert(21,"valla valla",5,11);
        System.out.println(sb); // Javaher seyi dusunmus valla, daha ne yapsin ?


    }
}
