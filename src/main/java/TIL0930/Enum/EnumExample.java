package TIL0930.Enum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnumExample {
    private static Map<String, CalculateEnum> operators = new HashMap<>();

    static {
        for (CalculateEnum value : CalculateEnum.values())
            operators.put(value.getOperator(), value);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] tokens = line.split(" ");

        double total = Double.parseDouble(tokens[0]);
        for (int i = 1; i < tokens.length - 1; i += 2) {
            total = operators.get(tokens[i]).calculate(total, Double.parseDouble(tokens[i + 1]));
        }

        System.out.println(total);
    }
}
