package ders27;

import java.time.LocalDate;

public class datetime
{
    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now();
        System.out.println(tarih);

        System.out.println(tarih.minusDays(100));

        System.out.println(tarih.minusWeeks(5).minusDays(3));

        System.out.println(tarih.plusMonths(5).plusWeeks(2).plusDays(3));


        System.out.println(tarih.getMonthValue());
        System.out.println(tarih.getMonth());

        System.out.println(tarih.getDayOfMonth());
        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.isLeapYear());

        System.out.println(tarih.withYear(1994).isLeapYear());
        System.out.println(tarih.withYear(2000).isLeapYear());

        System.out.println(tarih.withYear(2020).withMonth(11).withDayOfMonth(13));

        System.out.println(tarih.lengthOfYear());
        System.out.println(tarih.withYear(2000).lengthOfYear());

        System.out.println(tarih.withYear(1993).withMonth(10).withDayOfMonth(10).getDayOfWeek());

        LocalDate date1 =LocalDate.of(2011,11,11);

        LocalDate date2=LocalDate.of(2010,10,10);

        System.out.println(date2.isBefore(date1));
        System.out.println(date2.isAfter(date1));

        System.out.println(tarih.equals(date1));
    }
}
