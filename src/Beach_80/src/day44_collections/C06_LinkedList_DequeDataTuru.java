package Beach_80.src.day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C06_LinkedList_DequeDataTuru {

    public static void main(String[] args) {
        // Deque methodu iki tarafıda bas olarak kabul eder
        Deque<String> ll4 = new LinkedList<>();
        ll4.add("Tulay");
        ll4.add("Ibrahim");
        ll4.add("Selim");
        ll4.add("Sedat");
        ll4.add("Selim");
        // removeLastOccurrence methodu : ayni olan elementin sonda olanını siler
        ll4.removeLastOccurrence("Selim");
        ll4.removeFirstOccurrence("Sedat");
        System.out.println(ll4);// [Tulay, Ibrahim, Selim]
        System.out.println(ll4.pop());
        // LinkedList'in basindaki elemnti silip, bize dondurur

        ll4.remove();
        ll4.removeFirst();

        // Deque iki tarafli queue demektir,dolayisiyla her method'un first ve last'i varddir
    }
}
