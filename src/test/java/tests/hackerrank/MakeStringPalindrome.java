package tests.hackerrank;

import org.testng.annotations.Test;

import java.util.*;

public class MakeStringPalindrome {

    @Test
    public void testMakingStringPalindrome() {
        System.out.println(highestValuePalindrome("49327443204", 5, 6)); // 649578875946
    }

    public static String highestValuePalindrome(String s, int n, int k) {
        System.out.println(s);
        List<Integer> mandatoryReplaceableIndexes = new ArrayList<>();
        int l = s.length();
        System.out.println(l);
        if ( l == 1 ) {
            if (k > 0)
                return "9";
            return "-1";
        }
        if ( k >= l) {
            return s.replaceAll("[0-9]","9");
        }
        for (int i = 0; i < l / 2; i++) {
            if (s.charAt(i) != s.charAt(l - i - 1)) {
                int minValueIndex = s.charAt(i) < s.charAt(l - i - 1) ? i : l - i - 1;
                mandatoryReplaceableIndexes.add(minValueIndex);
            }
        }
        int sz = mandatoryReplaceableIndexes.size();
        if (sz > k) {
            return "-1";
        }
        mandatoryReplaceableIndexes.sort((a, b) -> Math.abs(l / 2 - b) - Math.abs(l / 2 - a));
        System.out.println(mandatoryReplaceableIndexes);
        StringBuffer stringBuffer = new StringBuffer(s);

        // execute if the initial string itself is palindrome
        if (sz == 0) {
            for (int i = 0; i < l/2; i++) {
                if ( (k-2) >= 0 ) {
                    if (stringBuffer.charAt(i) !='9') {
                        stringBuffer.setCharAt(i, '9');
                        stringBuffer.setCharAt(l - i - 1, '9');
                        k-=2;
                    }
                } else {
                    break;
                }
            }
            if ( (k == 1) && (l%2 == 1)) {
                stringBuffer.setCharAt(l/2,'9');
            }
            return stringBuffer.toString();
        }

        // replace mandatory characters to get palindrome string
        for (int i: mandatoryReplaceableIndexes) {
            if ( k  > sz ) {
                if (stringBuffer.charAt(l-i-1) != '9') {
                    stringBuffer.setCharAt(i, '9');
                    stringBuffer.setCharAt(l-i-1, '9');
                    k -= 2;
                } else {
                    stringBuffer.setCharAt(i, '9');
                    k--;
                }
            } else {
                stringBuffer.setCharAt(i, stringBuffer.charAt(l-i-1));
                k--;
            }
            sz--;
        }
        System.out.println("sz = " + sz);
        System.out.println(stringBuffer);
        System.out.println("k = " + k);
        if (k == 0) {
            return stringBuffer.toString();
        }
        // what if charAt(i) == 9
        for (int i = 0; i < l/2 && k > 1; i++) {
            if (stringBuffer.charAt(i) != '9') {
                stringBuffer.setCharAt(i, '9');
                stringBuffer.setCharAt(l-i-1, '9');
                k-=2;
            }
        }
        if (k == 1 && (l%2 == 1)) {
            stringBuffer.setCharAt(l/2,'9');
        }
        return stringBuffer.toString();
    }
}
