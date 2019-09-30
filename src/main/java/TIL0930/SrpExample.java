package TIL0930;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SrpExample {
    private static final Map<String, CalculateStrategy> calculators = new HashMap<>();

    static {
        calculators.put("+", new PlusStrategy());
        calculators.put("-", new MinusStrategy());
        calculators.put("/", new DivideStrategy());
        calculators.put("*", new MultiplyStrategy());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] tokens = line.split(" ");

        double total = Double.parseDouble(tokens[0]);
        for (int i = 1; i < tokens.length - 1; i += 2) {
            total = calculators.get(tokens[i]).calculate(total, Double.parseDouble(tokens[i+1]));
        }

        System.out.println(total);

    }
}
