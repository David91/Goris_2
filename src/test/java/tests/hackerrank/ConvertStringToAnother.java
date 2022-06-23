package tests.hackerrank;

public class ConvertStringToAnother {
    public static void main(String[] args) {

        System.out.println(appendAndDelete("asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv",
                "asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv", 20));

    }

    public static String appendAndDelete(String s, String t, int k) {
        int l1 = s.length();
        int l2 = t.length();
        if ((l1 + l2) <= k) {
            return "Yes";
        }
        if (Math.abs(l2 - l1) > k) {
            return "No";
        }
        if (s.equals(t)) {
            return "Yes";
        }
        if (l1 == l2 && (k % 2) == 0) {
            return "No";
        }
        System.out.println("aaaaaa");
        boolean is_k_Even = k % 2 == 0;
        boolean isDiffEven = Math.abs(l2 - l1) % 2 == 0;
        if (is_k_Even != isDiffEven) {
            return "No";
        }

        String longestStr = l2 > l1 ? t : s;
        String shortestStr = l2 < l1 ? t : s;
        if ((longestStr.length() - shortestStr.length()) == k) {
            if (longestStr.startsWith(shortestStr)) {
                return "Yes";
            }
            return "No";
        }
        int cuttingPoint = (k - Math.abs(l2-l1))/2;

        if (longestStr.startsWith(shortestStr.substring(0, shortestStr.length() - cuttingPoint))) {
            return "Yes";
        }
        return "No";

    }
}
