package TIL1130;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        String A = inputs[0];
        String B = inputs[1];

        int difference;

        if (A.length() == B.length()) {
            difference = 0;
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) != B.charAt(i)) {
                    difference++;
                }
            }
        } else {
            difference = Integer.MAX_VALUE;
            int loop = B.length() - A.length();
            for (int i = 0; i <= loop; i++) {
                int temp = 0;
                for (int j = 0; j < A.length(); j++) {
                    if (A.charAt(j) != B.charAt(i + j)) {
                        temp++;
                    }
                }
                difference = Math.min(temp, difference);
            }
        }
        System.out.println(difference);


    }
}
