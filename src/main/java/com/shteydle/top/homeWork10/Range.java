package com.shteydle.top.homeWork10;

/*Создать программу, которая позволяет ввести с клавиатуры n диапазонов
целочисленных значений (например, 3-10). Каждый диапазон имеет начальную и конечную точку.
После ввода программа должна вывести длину каждого диапазона. Программа должна выводить
сообщение об ошибке, если начало диапазона больше, чем конец.
Протестировать с использованием JUnit.*/

public class Range {

    private int start;
    private int finish;

    public static String getRange(String start, String finish) {
        String result;
        int s = Integer.parseInt(start);
        int f = Integer.parseInt(finish);
        if (f < s) {
            result = "Ошибка, начало диапазона " + s + " больше, чем конец диапазона " + f;
        } else {
            result = "диапазон между " + s + " и " + f + " равен: " + (f - s);
        }
        return result;
    }

    public static String intersection(Range r1, Range r2) {

        boolean flag = false;
        boolean check = true;
        String result = "";
        
        if (r1.getStart() > r1.getFinish()) {
            result = "Ошибка, в первом диапазоне начало диапазона " + r1.getStart() + " больше, чем конец диапазона " + r1.getFinish();
            check = false;
        } else if (r2.getStart() > r2.getFinish()) {
            result = "Ошибка, во втором диапазоне начало диапазона " + r2.getStart() + " больше, чем конец диапазона " + r2.getFinish();
            check = false;
        }
        if (check) {
            for (int i = r1.getStart(); i <= r1.getFinish(); i++) {
                for (int j = r2.getStart(); j <= r2.getFinish(); j++) {
                    if (i == j) {
                        flag = true;
                        break;
                    }
                }
            }
            result = flag ? r1.toString() + " и " + r2.toString() + " пересекаются" : r1.toString() + " и " + r2.toString() + " не пересекаются";
        }
        return result;
    }

    public Range(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }

    public Range() {
    }

    @Override
    public String toString() {
        return "Диапазон " + start + "-" + finish;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getFinish() {
        return finish;
    }

    public void setFinish(int finish) {
        this.finish = finish;
    }
}
