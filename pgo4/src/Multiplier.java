
import java.math.BigDecimal;
import java.util.List;

public class Multiplier {

    //a)
    public int multiply(int a, int b) {
        return a * b;
    }

    //b)
    public int multiply(int a, int b, int c, int d) {
        return multiply(multiply(a, b), multiply(c, d));
    }

    //c)
    public double multiply(double a, double b) {
        return a * b;
    }

    //d)
    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    //e)
    public int multiply(List<Integer> numbers) {
        int result = 1;
        for (int i = 0; i < numbers.size(); i++) {
            result = result * numbers.get(i);
        }
        return result;
    }
}
