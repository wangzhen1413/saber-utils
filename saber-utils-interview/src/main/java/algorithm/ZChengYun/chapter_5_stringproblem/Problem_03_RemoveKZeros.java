package algorithm.ZChengYun.chapter_5_stringproblem;

/**
 * 去掉字符串中连续出现K个0的子串
 */
public class Problem_03_RemoveKZeros {

    public static String removeKZeros(String str, int k) {
        if (str == null || k < 1) {
            return str;
        }

        char[] chas = str.toCharArray();
        int count = 0, start = -1;
        for (int i = 0; i != chas.length; i++) {
            if (chas[i] == '0') {
                count++;
                start = start == -1 ? i : start;
            } else {
                if (count == k) {
                    while (count-- != 0) {
                        chas[start++] = 0;
                    }
                }
                count = 0;
                start = -1;
            }
        }
        if (count == k) {
            while (count-- != 0) {
                chas[start++] = 0;
            }
        }
        StringBuilder result = new StringBuilder();
        result = filter(chas);
        //return String.valueOf(chas);
        return result.toString();
    }

    private static StringBuilder filter(char[] chas) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i != chas.length; i++) {
            if( chas[i] != 0){
                result.append(chas[i]);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String test = "0A0B0C00D0";
        String test1 = "0A0B0C00D0";
        System.out.println(removeKZeros(test, 1));

        String test2 = "00A00B0C00D0";
        System.out.println(removeKZeros(test2, 2));

        String test3 = "000A00B000C0D00";
        System.out.println(removeKZeros(test3, 3));

        String test4 = "0000A0000B00C000D0000";
        System.out.println(removeKZeros(test4, 4));

        String test5 = "00000000";
        System.out.println(removeKZeros(test5, 5));

    }

}
