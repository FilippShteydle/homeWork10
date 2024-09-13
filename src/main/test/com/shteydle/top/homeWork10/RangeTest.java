package com.shteydle.top.homeWork10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeTest {

    @Test
    void toGetRange() {

        Range r1 = new Range(5, 9);
        String str = "Диапазон 5-9";

        assertEquals(str,r1.toString());
    }

    @Test
    void toGetInterSection() {

        Range r1 = new Range(3, 9);
        Range r2 = new Range(1, 4);

        String str = "Диапазон 3-9 и Диапазон 1-4 пересекаются";
        assertEquals(str, Range.intersection(r1, r2));
    }

    @Test
    void createRange() {
        Range r1 = new Range();
        r1.setStart(5);
        r1.setFinish(9);
        String str = "Диапазон 5-9";

        assertEquals(str,r1.toString());
    }

    @Test
    void getStartFinish() {
        Range r1 = new Range(3, 9);
        int a = r1.getStart();
        int b = r1.getFinish();
        assertEquals(3, a);
        assertEquals(9, b);
    }

}
