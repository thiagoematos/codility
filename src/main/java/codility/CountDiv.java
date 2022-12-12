package codility;

public class CountDiv {
    public int solution(int A, int B, int K) {
        var firstDivisible = findFirstDivisible(A, K);
        var lastDivisible = findLastDivisible(B, K);

        return ((lastDivisible - firstDivisible) / K) + 1;
    }

    private int findFirstDivisible(int A, int K) {
        for (var index = A; index < Integer.MAX_VALUE; index++) {
            if (index % K == 0) {
                return index;
            }
        }
        return -1;
    }

    private int findLastDivisible(int B, int K) {
        for (var index = B; index > 0; index--) {
            if (index % K == 0) {
                return index;
            }
        }
        return -1;
    }
}
