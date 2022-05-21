import java.util.*;
public class SUM1000 extends Thread {
    int[] array;
    int sum = 0;

    public int getSum() {
        return sum;
    }

    public SUM1000() {
        Random r = new Random();
        array = new int[100];
        for (int i = 0; i < array.length; i++) array[i] = r.nextInt(100);
    }

    public void run() {
        int i = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }
    }

    public static void main(String[] args) {
        SUM1000 t[] = new SUM1000[10];
        int sum = 0;
        for (int i = 0; i < t.length; i++) {
            t[i] = new SUM1000();
            t[i].start();
        }
        for (int i = 0; i < t.length; i++) {
            sum += t[i].getSum();
        }
        System.out.println("Sum of 1000 integers is: " + sum);
        float avg = sum / 100.0f;
        System.out.println("Average of 1000 integers is: " + avg);
    }
}


