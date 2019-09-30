package TIL0930.Enum;

public enum CalculateEnum {
    PLUS {
        @Override
        public double calculate(double num1, double num2) {
            return num1 + num2;
        }
    }, MINUS {
        @Override
        public double calculate(double num1, double num2) {
            return num1 - num2;
        }
    }, DIVIDE {
        @Override
        public double calculate(double num1, double num2) {
            return num1 / num2;
        }
    }, MULTIPLY {
        @Override
        public double calculate(double num1, double num2) {
            return num1 * num2;
        }
    };

    public abstract double calculate(double num1, double num2);
}
