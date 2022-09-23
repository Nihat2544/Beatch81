package Beach_80.src.day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C04_LinkedList_ListDataTuru {
    public static void main(String[] args) {
        LinkedList<String> ll1= new LinkedList<>();

        List<String> ll2=new LinkedList<>();

        Queue<String> ll3= new LinkedList<>();

        Deque<String> ll4= new LinkedList<>();


        ll2.add("Berk");
        ll2.add("Nihat");
        ll2.add("Azra");
        ll2.add("Filiz");

        System.out.println(ll2);
        System.out.println(ll2.remove(1));// Nihat
        // eger listemiz integer elementlerden olusuyorsa
        // direk sayi olarak yazarsak index olarak kabul eder
        // bir variable ye atama yapar remove da o variable'in ismini yazarsak obje olarak kabul eder
        System.out.println(ll2.remove("Kemal")); // false
        System.out.println(ll2.isEmpty());// false

        System.out.println(ll2.set(1, "Ali"));
        System.out.println(ll2);//[Berk, Ali, Filiz]
        ll1.add("Berk");
        ll1.add("Ismail");
        System.out.println(ll1);//[Berk, Ismail]
        ll2.retainAll(ll1);// ll2 deki tum elemntleri ll1 ile karsilastirir
        // ll1 de olmayanlari siler (ortak olanlari birakir olmayanlari siler)

        System.out.println(ll2);//[Berk]

        System.out.println(ll2.hashCode());// 2066939
        ll2.add("Fatih");
        System.out.println(ll2.hashCode());//131726141

    }
}
