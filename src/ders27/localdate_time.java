package ders27;

import java.time.LocalDateTime;

public class localdate_time
{
    public static void main(String[] args) {

        LocalDateTime zaman=LocalDateTime.now();

        System.out.println(zaman);

        System.out.println(zaman.getDayOfYear());
        System.out.println(zaman.plusMonths(3).plusWeeks(2).plusDays(2).plusHours(3).plusMinutes(23).plusSeconds(23));


    }
}
