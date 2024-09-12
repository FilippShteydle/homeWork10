package com.shteydle.top.homeWork10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие: \n 1 - ввести диапазон; \n 2 - проверить, пересекаются ли диапазоны.");
        int option = scanner.nextInt();

        if (option == 1) {
            scanner.nextLine();
            System.out.print("Введите диапазоны чисел через запятую: ");
            String str = scanner.nextLine();
            String[] arr = str.split(", | ");

            for (int i = 1; i <= arr.length; i += 2) {
                System.out.println(Range.getRange(arr[i - 1], arr[i]));
            }
        } else if (option == 2) {
            scanner.nextLine();
            System.out.print("Введите два диапазона через запятую: ");
            String str = scanner.nextLine();
            String[] arr = str.split(", | ");
            Range r1 = new Range(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
            Range r2 = new Range(Integer.parseInt(arr[2]), Integer.parseInt(arr[3]));
            System.out.println(Range.intersection(r1, r2));
        }
    }
}
