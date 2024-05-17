import java.math.BigDecimal;
import java.util.List;

public class Adder {

    public int add(int a, int b) {
        return a + b;
    }

    public BigDecimal add(List<BigDecimal> numbers) {
        BigDecimal result = BigDecimal.ZERO;
        for (int i = 0; i < numbers.size(); i++) {
            result = result.add(numbers.get(i));
        }
        return result;
    }
}
