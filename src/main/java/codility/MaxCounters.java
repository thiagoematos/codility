package codility;

import static java.lang.Math.max;
import static java.util.Arrays.fill;

public class MaxCounters {
    public int[] solution(int n, int[] commands) {
        var result = new int[n];

        var theBiggestNumber = 0;

        for (int command : commands) {
            if (command == 0) continue;

            if (command == n + 1) {
                maximize(result, theBiggestNumber);
            } else {
                command--;

                result[command]++;
                theBiggestNumber = max(theBiggestNumber, result[command]);
            }
        }

        return result;
    }

    private static void maximize(int[] maxCounters, int max) {
        fill(maxCounters, max);
    }
}
