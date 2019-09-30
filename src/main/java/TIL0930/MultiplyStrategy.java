package TIL0930;

public class MultiplyStrategy implements CalculateStrategy {
    @Override
    public double calculate(double total, double nextToken) {
        return total * nextToken;
    }
}
