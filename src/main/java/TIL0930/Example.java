package TIL0930;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        String[] tokens = line.split(" ");

        double total = Double.parseDouble(tokens[0]);

        for (int i = 1; i < tokens.length - 1; i += 2) {
            total = calculate(total, tokens[i], Integer.parseInt(tokens[i + 1]));
        }

    }

    private static double calculate(double total, String token, int nextToken) {
        if (token.equals("+")) {
            return total + nextToken;
        }

        if (token.equals("-")) {
            return total - nextToken;
        }

        if (token.equals("/")) {
            return total / nextToken;
        }

        if (token.equals("*")) {
            return total * nextToken;
        }
        return total;
    }
}
