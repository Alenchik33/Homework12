package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {
    @Test
    public void testSimpleTaskFounded() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить");

        Assertions.assertTrue(actual);

    }

    @Test
    public void testSimpleTaskNotFounded() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Написать");

        Assertions.assertFalse(actual);
    }

    @Test
    public void testEpicFounded() {
        Epic epic = new Epic(3, new String[]{"Мороженое", "Cola", "Чипсы"});

        boolean actual = epic.matches("Cola");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testEpicNotFounded() {
        Epic epic = new Epic(3, new String[]{"Мороженое", "Cola", "Чипсы"});

        boolean actual = epic.matches("Фрукты");

        Assertions.assertFalse(actual);
    }

    @Test
    public void testMeetingFoundedInProject() {
        Meeting meeting = new Meeting(3, "Расширение функционала", "Мобильное приложение", "28/06 в 18:00");

        boolean actual = meeting.matches("Мобильное");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMeetingFoundedInTopic() {
        Meeting meeting = new Meeting(3, "Расширение функционала", "Мобильное приложение", "28/06 в 18:00");

        boolean actual = meeting.matches("Расширение");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMeetingNotFounded() {
        Meeting meeting = new Meeting(3, "Расширение функционала", "Мобильное приложение", "28/06 в 18:00");

        boolean actual = meeting.matches("Сокращение");

        Assertions.assertFalse(actual);
    }
}
