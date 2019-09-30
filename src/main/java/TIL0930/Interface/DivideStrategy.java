package TIL0930.Interface;

import TIL0930.Interface.CalculateStrategy;

public class DivideStrategy implements CalculateStrategy {
    @Override
    public double calculate(double total, double nextToken) {
        return total / nextToken;
    }
}
