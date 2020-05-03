package Calculator;

public class Check {
    public static void check(int y, int u) {
        if (y >= 10 & u >= 10) {
            throw new RuntimeException("Значения от 0 до 9!");
        }
    }
}
