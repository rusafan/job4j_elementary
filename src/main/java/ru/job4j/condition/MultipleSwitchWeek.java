package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        int value = switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
        return value;
    }

    public static void main(String[] args) {
        String dayOfweek = "Воскресенье";
        int day = MultipleSwitchWeek.numberOfDay(dayOfweek);
        System.out.println(dayOfweek + " -> " + day);
    }
}