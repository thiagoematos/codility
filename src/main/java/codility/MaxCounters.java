package codility;

import static java.util.Arrays.fill;

public class MaxCounters {
    public int[] solution(int n, int[] arr) {
        var maxCounters = new int[n];

        var max = 0;

        for (int operation : arr) {
            if (operation == 0) continue;

            if (operation == n + 1) {
                fill(maxCounters, max);
            } else {
                operation--;

                maxCounters[operation]++;
                if (maxCounters[operation] > max) {
                    max = maxCounters[operation];
                }
            }
        }

        return maxCounters;
    }
}
