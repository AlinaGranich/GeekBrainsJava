import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        isSum(8, 18);
        boolean result = isSum(8, 18);
        System.out.println(result);

        isPositiveOrNegative();

        isNegative(8);
        boolean res = isNegative(8);
        System.out.println(res);

        String name = "word";
        printWordNTimes(name, 7);

        vYear(2010);


    }

    public static boolean isSum(int a, int b) {
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative() {
        int x = 18;
        if (x < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положительное");
        }
    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }


    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < 10; i++) {
            System.out.println(word);
        }
    }
    public static boolean vYear(int x) {
        if (x % 4 == 0) {
            if (x % 100 == 0 && x % 400 != 0) {
                return false;
            }
            return true;
        }

        return false;
    }
}










