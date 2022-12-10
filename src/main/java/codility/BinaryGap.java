package codility;

import static java.lang.Integer.toBinaryString;

public class BinaryGap {

    private static final char ZERO = '0';

    public int solution(int N) {
        var binary = toBinaryString(N).toCharArray();

        var theBiggestGap = 0;
        var counterOfZero = 0;

        for (var number : binary) {
            if (number == ZERO) {
                counterOfZero++;
            } else {
                if (counterOfZero > theBiggestGap) {
                    theBiggestGap = counterOfZero;
                }
                counterOfZero = 0;
            }
        }

        return theBiggestGap;
    }
}
