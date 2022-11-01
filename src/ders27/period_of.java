package ders27;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class period_of
{
    public static void main(String[] args) {
        //doğumunuzdan bugüne ne kadar zaman gecti

        LocalDate zaman= LocalDate.now();
        LocalDate birth=LocalDate.of(1994,1,16);

        Period gecensure=Period.between(birth,zaman);
        System.out.println(gecensure);

        System.out.println(gecensure.getYears());

    }
}
