package codility;

import static java.lang.System.arraycopy;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        if (K == 0 || A.length == 0) {
            return A;
        }

        if (K < A.length) {
            var result = new int[A.length];

            var quantityOfItemsToCopy_FirstPart = A.length - K;
            var quantityOfItemsToCopy_SecondPart = A.length - quantityOfItemsToCopy_FirstPart;

            var copyItemsFrom = 0;
            var pastItemFrom = K;
            arraycopy(A, copyItemsFrom, result, pastItemFrom, quantityOfItemsToCopy_FirstPart);

            copyItemsFrom = quantityOfItemsToCopy_FirstPart;
            pastItemFrom = 0;
            arraycopy(A, copyItemsFrom, result, pastItemFrom, quantityOfItemsToCopy_SecondPart);

            return result;
        }
        return solution(A, K % A.length);
    }
}
