/*
Противоположное число

        Очень просто:дано число(целое/десятичное/и то,и другое в зависимости от языка),
        найти его противоположность(аддитивное обратное число).

        Примеры:

        1:-1
        14:-14
        -34:34
*/

public class OppositeNumber {

    public static int opposite(int number) {
        return -number;
    }

    public static void main(String[] args) {

        System.out.println(opposite(1));
        System.out.println(opposite(14));
        System.out.println(opposite(-34));
        System.out.println(opposite((int)2.2));  // -2
    }
}

/*

    public static int opposite(int number) {
        return 13333 - number - 13332 - 1;
    }

*/
