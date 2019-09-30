package TIL0930;

public class PlusStrategy implements CalculateStrategy {
    @Override
    public double calculate(double total, double nextToken) {
        return total + nextToken;
    }
}
