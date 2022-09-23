package Beach_80.src.day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C05_linkedList_QueueDataTuru {

    public static void main(String[] args) {
        Queue<String> ll3=new LinkedList<>();
        ll3.add("Adem");
        ll3.add("Oktay");
        ll3.add("Murat");
        ll3.add("Kerem");

        // Queue kuyruk demektir, sira onemlidir
        // gelen sona gelir, giden bastan gider

        System.out.println(ll3);// [Adem, Oktay, Murat, Kerem]

        System.out.println(ll3.remove());//Adem

        System.out.println(ll3);// [Oktay, Murat, Kerem]

        System.out.println(ll3.remove("Murat"));// true

        System.out.println(ll3);// [Oktay, Kerem]

        System.out.println(ll3.element());// Oktay
        System.out.println(ll3.peek());// Oktay

        Queue<String> ll4 = new LinkedList<>();
       // System.out.println(ll4.element());// throws exeptions NoSuchElementException
        System.out.println(ll4.peek());// null
        // peek ve element silmeden ilk elementi bize dondurur
        // aralarindaki fark bos liste olursa peek null doner, element exeptions firlatir

        // offer sona ekleme yapar
        ll3.offer("Ahmet");
        System.out.println(ll3);// [Oktay, Kerem, Ahmet]
        ll3.offer("Nihat");
        System.out.println(ll3);// [Oktay, Kerem, Ahmet, Nihat]

        System.out.println(ll3.poll());// Oktay
        System.out.println(ll3);// [Kerem, Ahmet, Nihat]

       // System.out.println(ll4.remove());//throws exeptions NoSuchElementException

        System.out.println(ll4.poll());// null

    }
}
