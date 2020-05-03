package Calculator;

public class CalculateRoman extends Main {
    public static int calculateroman(int t, String sign, int f) {
        switch (sign) {
            case "+":
                r = t + f;
                break;
            case "-":
                r = t - f;
                break;
            case "*":
                r = t * f;
                break;
            case "/":
                if (f == 0) {
                    throw new ArithmeticException("На ноль делить нельзя!");
                }
                r = t / f;
                break;
        }
        return r;
    }
}