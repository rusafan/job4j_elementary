package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1 :
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            default:
                name = "Воскресенье";
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        int day = 5;
        String name = SwitchWeek.nameOfDay(day);
        System.out.println(day + " - " + name);
    }
}