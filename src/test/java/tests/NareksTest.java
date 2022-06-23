package tests;

import org.testng.annotations.Test;

public class NareksTest {

    @Test
    public void getMaxSub() {
        int[] array = {2,1,4,6,3,1,2,3,4,5};
        int firstAscendingSequence = 0;
        int secondAscendingSequence = 0;
        int countUntilFirstSequence = 0;
        int firstIndex = 0;
        int lastIndex = 0;
        for (int i = 0; i < array.length - 1; i++) {
            firstAscendingSequence = i + 1 - countUntilFirstSequence;
            if (array[i] > array[i + 1]) {
                countUntilFirstSequence = i + 1;
            }
            if (firstAscendingSequence > secondAscendingSequence) {
                secondAscendingSequence = firstAscendingSequence;
                firstIndex = i + 1 - secondAscendingSequence;
                lastIndex = i;
            }
        }
        if (secondAscendingSequence == array.length - 1 - countUntilFirstSequence) {
            secondAscendingSequence = secondAscendingSequence + 1;
            firstIndex = array.length - 1 - secondAscendingSequence;
            lastIndex = array.length - 1;
        }
        System.out.println("The sequence length = " + secondAscendingSequence);
        System.out.println("The sequence first index  = " + firstIndex);
        System.out.println("The sequence last index = " + lastIndex);
    }

    @Test
    public void diagonalSum() {
        int[][] array = {{1, 35, 1},
                         {61, 2, 45},
                         {3, 12, 3}};
        int index1 = 0;
        int index2 = array.length - 1;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2){
                sum += array[i][index1] + array[i][index2];
                index1++;
                index2--;
            }
            if (i == array.length / 2) {
                if (array.length % 2 != 0) {
                    sum += array[i][index1];
                } else {
                    sum += array[i][index1] + array[i][index2];
                }
            }
            if (i > array.length /2) {
                if (array.length % 2 != 0) {
                    index1--;
                    index2++;
                    sum += array[i][index1] + array[i][index2];
                } else {
                    index1 -= 2;
                    index2 += 2;
                    sum += array[i][index1] + array[i][index2];
                }
            }

        }
        System.out.println(sum);
    }

    @Test
    public void diagonalSum2() {
        int[][] array = {{1, 35, 1, 1},
                         {61, 2, 2, 12},
                         {3,  5, 3, 11},
                         {1, 10, 4, 1}};

        int sum1 = 0;
        int sum2 = 0;
        int n = array.length - 1;
        for (int i = 0; i < n; i++) {
            sum1 += array[i][i];
            sum2 += array[i][n-i-1];
        }
        if ( n%2 == 1 ) {
            sum1 -= array[n/2][n/2];
        }
        System.out.println(sum1 + sum2);

    }

}
