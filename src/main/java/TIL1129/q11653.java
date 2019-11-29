package TIL1129;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class q11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        boolean[] isPrimeNumber = new boolean[10000001];
        Arrays.fill(isPrimeNumber, true);
        isPrimeNumber[0] = false;
        isPrimeNumber[1] = false;

        //에라토니스의 체
        for (int i = 2; i <= 10000000; i++) {
            if (isPrimeNumber[i]) {
                for (int j = i + i; j < 10000000; j += i) {
                    isPrimeNumber[j] = false;
                }
            }
        }

        int num = Integer.parseInt(bf.readLine());

        List<Integer> nums = new ArrayList<>();
        while (num != 1) {
            for(int i = 2; i <= 10000000; i++) {
                if(isPrimeNumber[i] && num % i == 0) {
                    nums.add(i);
                    num = num / i;
                }
            }
        }

        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
    }

    /**
     * for(int i=2; i*i<=n; i++) {
     * 			while(n%i==0) {
     * 				System.out.println(i);
     * 				n/=i;
     *                        }* 		}
     *
     * 		if(n>1) {
     * 			System.out.println(n);
     *        }
     *
     *  i*i를 하는 이유 -> n이 100이라고 가정했을 때 10 * 10 ,즉 i는 2부터 10까지 도는데
     *  10까지만 하는 이유는 20도 나누어 지지만 그 전에 어차피 2로 나눌때 다 나누기 때문에 20이 왔을 때 나머지가 항상 존재
     */
}
