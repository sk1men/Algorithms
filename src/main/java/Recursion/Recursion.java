package Recursion;

public class Recursion {


    int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1) + 1;
    }
// factorial(1):     return 1
// factorial(2):     return 2 * factorial(1) (return 2 * 1)
// factorial(3):     return 3 * factorial(2) (return 3 * 2 * 1)
// factorial(4):     return 4 * factorial(3) (return 4 * 3 * 2 * 1)


    public static void main(String[] args) {
        System.out.println(palindrom("" + 1231));
    }

    private static boolean palindrom(String str) {

        if (str.length() == 1) {
            return true;
        } else {
            if (str.substring(0, 1).equals(str.substring(str.length() - 1, str.length()))) {
                if (str.length() == 2) {
                    return true;
                }

                return palindrom(str.substring(1, str.length() - 1));
            } else {
                return false;
            }
        }
    }

    static int fib(int i) {
        if (i <= 0) {
            return 1;
        }
        return fib(i - 2) + fib(i - 1);
    }

    static int fact(int i) {
        if (i <= 0) {
            return 0;
        }
        if (i <= 1) {
            return 1;
        }

        return i * fact(i - 1);
    }

    static String integer(int i) {
        if (i <= 1) {
            return "" + 1;
        }
        return "" + integer(i - 1) + ", " + i;
    }

    static String integerAtoB(int a, int b) {
        if (a < b) {
            return "" + getIntMinToMax(a, b);
        } else {
            return "" + getIntMaxToMin(a, b);
        }
    }

    private static String getIntMaxToMin(int max, int min) {//10 4
        if (max == min) {
            return "" + max;
        }
        return "" + max + "\n" + getIntMaxToMin(--max, min);

    }

    private static String getIntMinToMax(int min, int max) {
        if (min == max) {
            return "" + max;
        }
        return "" + min + "\n" + getIntMinToMax(++min, max);
    }

    private static String intLeftToRight(int number) {
        if (number < 10) {
            return "" + number;
        }
        return "" + number % 10 + intLeftToRight(number / 10);
    }

    private static String intRightToLeft(int number) {
        if (number < 10) {
            return "" + number;
        }
        return "" + intRightToLeft(number / 10) + " " + number % 10;
    }

    private static void mnozhnuku(int number, int param) { //int n, int k

        if (param > number / 2) {      // k > n / 2 ;5>5/2
            System.out.println(number);
            return;
        }
        if (number % param == 0) {  //n % k == 0
            System.out.println(param);
            mnozhnuku(number / param, param); //75 2; 25 3; 5,5;
        } else {
            mnozhnuku(number, ++param);
        }
    }

}
