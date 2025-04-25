/*
Вам нужен только один - Новичок

        Вам будет предоставлен массив a и значение x.

        Все, что вам нужно сделать, это проверить, содержит ли предоставленный массив значение.

        a может содержать числа или строки. x может быть и тем, и другим.

        Верните true, если массив содержит значение, false если нет.
*/


import java.util.Arrays;

public class YouOnlyNeedOneBeginner {

    public static boolean check(Object[] a, Object x) {
        for (Object el : a
        ) {
            if (el == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(check(new Object[]{1, 2, 3}, 2));
        System.out.println(check(new Object[]{1, 2, 3}, 5));
        System.out.println(check(new Object[]{'t', 'e', 's', 't'}, 's'));
        System.out.println(check(new Object[]{"what", "a", "great", "kata"}, "kat"));
    }
}

/*public class Solution {

    public static boolean check(Object[] a, Object x) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == x)
                return true;
        return false;
    }

}*/