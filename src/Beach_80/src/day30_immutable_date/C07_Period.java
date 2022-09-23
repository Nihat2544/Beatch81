package Beach_80.src.day30_immutable_date;

import java.time.Period;

import java.time.LocalDate;

public class C07_Period {
    public static void main(String[] args) {
        // iki tarih arasindaki sureyi bulma

        LocalDate tarih1 = LocalDate.of(1986,1,5);
        LocalDate bugun = LocalDate.now();

        Period period=Period.between(bugun,tarih1);
        System.out.println(period); // P-36Y-6M-18D

        System.out.println(period.getYears()); // 36



    }
}
