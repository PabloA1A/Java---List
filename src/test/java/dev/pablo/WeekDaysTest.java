package dev.pablo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

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

    @Test
    void testGetDays() {
        List<String> dayList = weekDays.getDays();
        assertEquals(7, dayList.size());
        assertEquals("Monday", dayList.get(0));
        assertEquals("Sunday", dayList.get(6));
    }

    @Test
    void testGetDaysCount() {
        assertEquals(7, weekDays.getDaysCount());
    }

    @Test
    void testRemoveDay() {
        assertTrue(weekDays.removeDays("Monday"));
        weekDays.removeDay("Monday");
        assertFalse(weekDays.removeDays("Monday"));
    }

    @Test
    void testGetDay() {
        assertEquals("Monday", weekDays.getDay(0));
        assertEquals("Sunday", weekDays.getDay(6));
        assertNull(weekDays.getDay(7));
    }

    @Test
    void testDayExists() {
        assertTrue(weekDays.dayExists("Wednesday"));
        assertFalse(weekDays.dayExists("Mondey"));
    }

    @Test
    void testSortAlphabetically() {
        weekDays.sortAlphabetically();
        List<String> dayList = weekDays.getDays();
        assertEquals("Friday", dayList.get(0));
        assertEquals("Wednesday", dayList.get(6));
    }
}