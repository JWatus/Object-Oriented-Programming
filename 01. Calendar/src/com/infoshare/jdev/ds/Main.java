package com.infoshare.jdev.ds;

import com.infoshare.jdev.ds.common.DateExample;

public class Main {

    public static void main(String[] args) {
        DateExample date = new DateExample();

        date.printCurrentHour();
        date.printCurrentDay();
        date.printCurrentMonth();
        date.printCurrentYear();

        System.out.println(date.getDateBeforeAfter(0));
        System.out.println(date.getDateBeforeAfter(-5));
        System.out.println(date.getDateBeforeAfter(5));
        System.out.println("Today is the " + date.getDayOfWeek() + " day of current week");
    }
}
