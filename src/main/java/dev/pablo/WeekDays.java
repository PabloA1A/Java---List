package dev.pablo;

import java.util.ArrayList;
import java.util.List;

public class WeekDays {
    private List<String> days;

    public void createList() {
        days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
    }

    public List<String> getDays() {
        return new ArrayList<>(days);
    }
}