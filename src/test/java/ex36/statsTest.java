package ex36;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class statsTest {
    @Test
    void shouldCalculateAverage() {
        ArrayList<Integer> myArr = new ArrayList<Integer>();
        myArr.add(100);
        myArr.add(200);
        myArr.add(1000);
        myArr.add(300);
        stats.arr = myArr;
        double res = stats.average();
        assertEquals(400.0, res);
    }

    @Test
    void shouldCalculateMinimum() {
        ArrayList<Integer> myArr = new ArrayList<Integer>();
        myArr.add(100);
        myArr.add(200);
        myArr.add(1000);
        myArr.add(300);
        stats.arr = myArr;
        double res = stats.min();
        assertEquals(100.0, res);
    }

    @Test
    void shouldCalculateMaximum() {
        ArrayList<Integer> myArr = new ArrayList<Integer>();
        myArr.add(100);
        myArr.add(200);
        myArr.add(1000);
        myArr.add(300);
        stats.arr = myArr;
        double res = stats.max();
        assertEquals(1000.0, res);
    }

    @Test
    void shouldCalculateStandardDeviation() {
        ArrayList<Integer> myArr = new ArrayList<Integer>();
        myArr.add(100);
        myArr.add(200);
        myArr.add(1000);
        myArr.add(300);
        stats.arr = myArr;
        double res = stats.std();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        float twoDigits = Float.valueOf(decimalFormat.format(res));
        assertEquals(Math.round(353.55), Math.round(twoDigits));
    }
}