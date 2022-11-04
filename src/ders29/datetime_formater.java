package ders29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime_formater
{
    public static void main(String[] args) {

        LocalDateTime zaman=LocalDateTime.now();
        System.out.println(zaman);//unformated

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd/MM/YYYY");

        System.out.println(zaman.format(dtf1));


        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d:MMM:YY");

        System.out.println(zaman.format(dtf2));

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("d.MMMM.YYYY EEEE");

        System.out.println(zaman.format(dtf3));

    }
}
