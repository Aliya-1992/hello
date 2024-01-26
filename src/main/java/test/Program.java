package test;


import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); //выводит сегодняшнюю дату
        int year = localDate.getYear();
        int mounth = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        System.out.println(year);
        System.out.println(mounth);
        System.out.println(day);
        LocalDate localDate1 = localDate.plusYears(4);
        System.out.println(localDate1);
        localDate1 = localDate1.plusDays(22);
        localDate1 = localDate1.minusMonths(14);
        localDate1 = localDate1.minusMonths(10);
        System.out.println(localDate1);



    }
}
