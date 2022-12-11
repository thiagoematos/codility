package codility;

import java.util.Arrays;

public class MaxCounters {
    public int[] solution(int n, int[] commands) {
        var result = new int[n];

        var theBiggestNumber = 0;

        for (int command : commands) {
            if (command == 0) continue;

            if (command == n + 1) {
                maximize(result, theBiggestNumber);
            } else {
                var index = command - 1;

                result[index]++;
                theBiggestNumber = getMaxBetween(theBiggestNumber, result[index]);
            }
        }

        return result;
    }

    private static void maximize(int[] maxCounters, int max) {
        Arrays.fill(maxCounters, max);
    }

    private static int getMaxBetween(int theBiggestNumber, int result) {
        return Math.max(theBiggestNumber, result);
    }
}
