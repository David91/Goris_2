package tests.hackerrank;

import org.testng.annotations.Test;

//class RunnableWorker implements Runnable{
//    private int num;
//    private int foundRoot = -1;
//
//    public RunnableWorker(int n) {
//        num = n;
//    }
//
//    @Override
//    public void run() {
//        for (int i = num; i <= 4; i++) {
//            System.out.println(Thread.currentThread().getName() + ": " + i);
//        }
//    }
//
//}

public class FindAmountOfSquareIntegers {

    @Test
    public void printAllIntegerSquaresWithinRange() {
        int count = getCount(3, 9);
        System.out.println(count);
    }

    public static int getCount(int a, int b) {
        int a1 = a;
        int square1 = -1;
        int square2 = -1;
        while (a1 <= b) {
            if (isSquare(a1)) {
                square1 = a1;
                break;
            }
            a1++;
        }
        if (square1 > 0) {
            a1++;
        } else {
            return 0;
        }
        while (a1 <= b) {
            if (isSquare(a1)) {
                square2 = a1;
                break;
            }
            a1++;
        }
        if (square2 < 0) {
            return 1;
        }
        int count = 2;
        int diff = square2 - square1;
        diff += 2;
        for (int i = square2 + diff; i <= b; i += diff ) {
            ++count;
            diff +=2;
        }
        return count;

    }

    public static boolean isSquare(int num) {
        int rootInt = (int) Math.sqrt(num);
        return num == rootInt * rootInt;
    }
}
