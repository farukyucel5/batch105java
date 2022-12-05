package Newquestion;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Datetime_date {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please pass in your date of birth in year-month-day format.");
        LocalDate birthDate= LocalDate.parse(scan.nextLine());
        LocalDate currentDate=LocalDate.now();

        age(currentDate,birthDate);
    }

    private static void age(LocalDate currentDate, LocalDate birthDate) {
        Period diff=Period.between(currentDate,birthDate);//tarihler arası farkı veriyor fakat tire ile birlikte
        //verdiğinden bazı işlemler uyguladım aşağida tireyi kaldırmak için.

        String year= String.valueOf(diff.getYears());
        String month= String.valueOf(diff.getMonths());
        String day= String.valueOf(diff.getDays());

       String yearWithoutDash=year.replaceAll("-","");
       String monthWithoutDash=month.replaceAll("-","");
       String dayWithoutDash=day.replaceAll("-","");


       System.out.printf("You have been here in this world for "+
                yearWithoutDash+ " years " +
                monthWithoutDash+ " months " +" and "+
                dayWithoutDash +" days :):) ");
    }
}
