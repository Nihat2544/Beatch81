package Beach_80.src.day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1=LocalTime.now();
        System.out.println("time1 = " + time1); //19:17:50.808642
        /*
        Bizim olusturdugumuz date ve time
        canli saat ve terih degildir
        LocalTime.now(); kullandigimiz satirda
        o anki tarih veya saati alip
        bizim variable'imiza store eder
        time1 variable'inin degeri SABITTIR.

         */
        Thread.sleep(3000);

        time1=LocalTime.now();
        System.out.println(time1);//19:35:59.631271
        System.out.println( time1.getSecond()); // 59

        System.out.println(time1.plusSeconds(10000)); // 22:20:55.934927

        System.out.println(time1.minusMinutes(200)); // 16:14:15.934927

        System.out.println(time1.withHour(3)); // 03:35:59.631271


    }
}
