package tests.hackerrank;

import org.testng.annotations.Test;

public class LibraryFine {

    @Test
    public void testLibraryFine() {
        libraryFine(2, 7, 1014, 1, 1, 1015);
    }

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int yearDiff = y1 - y2;
        int monthDiff = m1 - m2;
        int dayDiff = d1 - d2;

        if (yearDiff < 0) {
            return 0;
        } else if (yearDiff > 0) {
            return 10000;
        }
        if (monthDiff > 0) {
            return 500 * monthDiff;
        } else if (monthDiff < 0) {
            return 0;
        }
        if (dayDiff > 0) {
            return 15 * dayDiff;
        } else {
            return 0;
        }
    }
}
