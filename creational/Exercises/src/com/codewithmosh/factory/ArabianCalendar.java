package com.codewithmosh.factory;

import java.util.Date;

public class ArabianCalendar implements Calendar {
    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("[Arabian Calendar] Adding an event on the given date.");
    }
}
