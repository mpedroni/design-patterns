package com.codewithmosh.factory;

import java.util.Date;

public class Scheduler {
    private Calendar calendar = createCalendar();

    public void schedule(Event event) {
        var today = new Date();
        calendar.addEvent(event, today);
    }

    protected Calendar createCalendar() {
        return new GregorianCalendar();
    }
}
