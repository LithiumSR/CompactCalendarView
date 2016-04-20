package com.github.sundeepk.compactcalendarview.domain;

import java.util.List;

public class CalendarDayEvent {

    private final List<Event> events;
    private final long timeInMillis;

    public CalendarDayEvent(long timeInMillis, List<Event> events) {
        this.timeInMillis = timeInMillis;
        this.events = events;
    }

    public long getTimeInMillis() {
        return timeInMillis;
    }

    public List<Event> getEvents() {
        return events;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CalendarDayEvent event = (CalendarDayEvent) o;

        if (timeInMillis != event.timeInMillis) return false;
        if (events != null ? !events.equals(event.events) : event.events != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = events != null ? events.hashCode() : 0;
        result = 31 * result + (int) (timeInMillis ^ (timeInMillis >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "CalendarDayEvent{" +
                "events=" + events +
                ", timeInMillis=" + timeInMillis +
                '}';
    }
}
