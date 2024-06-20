public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isEven() {
        return this.value % 2 == 0;
    }

    public boolean isOdd() {
        return this.value % 2 != 0;
    }

    public boolean isPrime() {
        if (this.value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(this.value); i++) {
            if (this.value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.getValue();
    }

    public static int parseInt(char[] chars) {
        int value = 0;
        for (char c : chars) {
            value = value * 10 + (c - '0');
        }
        return value;
    }

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
}