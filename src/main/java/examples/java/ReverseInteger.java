package examples.java;

public class ReverseInteger {
    public int reverse(int x) {
        if (x > -10 && x < 10) return x;
        else if (x <= 10) return - reversePositive(Math.abs(x));
        else return reversePositive(x);
    }

    private int reversePositive(int x) {
        String str = String.valueOf(x);
        char[] chars = new char[str.length()];
        return  0;
    }

    private char[] reverseChars(char[] chars) {
        return null;
    }
}
