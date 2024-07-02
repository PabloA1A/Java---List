package dev.pablo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeekDaysTest {
    private WeekDays weekDays;
    
    @BeforeEach
    public void setUp() {
        weekDays = new WeekDays();
        weekDays.createList();
    }

    @Test
    void testCreateList() {
        List<String> dayList = weekDays.getDays();
        assertEquals(7, dayList.size());
        assertTrue(dayList.contains("Monday"));
        assertTrue(dayList.contains("Tuesday"));
        assertTrue(dayList.contains("Wednesday"));
        assertTrue(dayList.contains("Thursday"));
        assertTrue(dayList.contains("Friday"));
        assertTrue(dayList.contains("Saturday"));
        assertTrue(dayList.contains("Sunday"));
    }
}
