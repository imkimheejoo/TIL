package TIL0930.Enum;

import java.util.function.BiFunction;

public enum CalculateEnum {
    PLUS("+", (num1, num2) -> num1 + num2),
    MINUS("-", (num1, num2) -> num1 - num2),
    DIVIDE("/", (num1, num2) -> num1 / num2),
    MULTIPLY("*", (num1, num2) -> num1 * num2);

    private String operator;
    private BiFunction<Double, Double, Double> expression;

    CalculateEnum(String operator, BiFunction<Double, Double, Double> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public double calculate(double num1, double num2) {
        return this.expression.apply(num1, num2);
    }

    public String getOperator() {
        return operator;
    }
}
