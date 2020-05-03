package Calculator;

public class Calculate extends Main{
    public static int сalculate(int a, String sign, int b) {
        switch (sign) {
            case "+":
                c = a + b;
                break;
            case "-":
                c = a - b;
                break;
            case "*":
                c = a * b;
                break;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("На ноль делить нельзя!");
                }
                c = a / b;
                break;
        }
        return c;
    }
}
