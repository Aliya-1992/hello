package HomeTask3;

import java.time.LocalDate;
import java.util.Random;
public class Task5 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        Random num = new Random();
        int year = num.nextInt(1950, 2010);
        int month = num.nextInt(1, 12);
        int day = num.nextInt(1, 25);
        LocalDate localDate1 = localDate.minusYears(year);
        localDate1 = localDate1.minusMonths(month);
        localDate1 = localDate1.minusDays(day);
        System.out.println(localDate1);
        int year1 = localDate1.getYear();
        int mounth1= localDate1.getMonthValue();
        int day1 = localDate1.getDayOfMonth();
        System.out.println("Человек родился "+ year1 + " лет "+ mounth1 + " месяцев " + day1+ " дней назад");




    }
}
