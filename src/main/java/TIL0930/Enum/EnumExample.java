package TIL0930.Enum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnumExample {
    private static Map<String, CalculateEnum> calculators = new HashMap<>();

    static {
        calculators.put("+", CalculateEnum.PLUS);
        calculators.put("-", CalculateEnum.MINUS);
        calculators.put("/", CalculateEnum.DIVIDE);
        calculators.put("*", CalculateEnum.MULTIPLY);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] tokens = line.split(" ");

        double total = Double.parseDouble(tokens[0]);
        for (int i = 1; i < tokens.length - 1; i += 2) {
            total = calculators.get(tokens[i]).calculate(total, Double.parseDouble(tokens[i + 1]));
        }

        System.out.println(total);
    }
}
