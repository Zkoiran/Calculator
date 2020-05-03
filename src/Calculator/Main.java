package Calculator;
import java.util.*;
public class Main{
    public static int a,b,c;
    public static String sign;
    public static int t,f,r;
    public static void main(String[] args) {
        insert();
    }
    public static String insert () {
        while (true) {
        Scanner in = new Scanner(System.in);
        String formula = in.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(formula, " ");
        String token1 = tokenizer.nextToken();
        String token2 = tokenizer.nextToken();
        String token3 = tokenizer.nextToken();
        sign = token2;
        if ((isDigit(token1)) & (isDigit(token3))){
            a = Integer.parseInt(token1);
            b = Integer.parseInt(token3);
            Check.check(a,b);
            System.out.println(Calculate.сalculate(a, sign, b));
        } else {
            t = RomanNumeral.romanToArabic(token1);
            f = RomanNumeral.romanToArabic(token3);
            Check.check(t,f);
            CalculateRoman.calculateroman(t, sign, f);
            System.out.println(Arabic.arabicToRoman(r));
        }
        }
        }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
