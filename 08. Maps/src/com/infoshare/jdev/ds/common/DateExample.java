package com.infoshare.jdev.ds.common;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * Create instance of calendar.
 * <p>
 * Provide implementation for all the methods
 */
public class DateExample {

    private Calendar c = Calendar.getInstance(); // singleton - za kazdym razem woła ta sama instancje, referencja do jednego miejsca w pamięci

    public void printCurrentDay() {
        String day = "";
        switch (c.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wendsday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
        }
        System.out.println(day);
    }

    public void printCurrentHour() {
        System.out.println(c.get(Calendar.HOUR));
    }

    public void printCurrentMonth() {
        System.out.println(c.get(Calendar.MONTH));
    }

    public void printCurrentYear() {
        System.out.println(c.get(Calendar.YEAR));
    }

    public int getDayOfWeek() {
        return c.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * If negative number is passed that means before - positive after.
     * <p>
     * 0 is today!
     *
     * @param days days after/before today
     * @return Calculated date
     */
    public LocalDate getDateBeforeAfter(int days) {
       return  LocalDate.now().plusDays(days);

    }
}
