package Beach_80.src.day31_timeFormatter_varags;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println("ilk olusturulan tarih : " + tarihSaat);
        // ilk olusturulan tarih : 2022-07-25T21:41:06.777230

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/M/yy  hh:mm");
        System.out.println(dtf.format(tarihSaat));// 25/7/22  09:46

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("d/MMM/yyyy  HH:mm");
        System.out.println(dtf1.format(tarihSaat)); // 25/Tem/2022  21:46

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d/MMMM/yyy  HH:mm a");
        System.out.println(dtf2.format(tarihSaat)); //25/Temmuz/2022  21:48 ÖS


    }
}
