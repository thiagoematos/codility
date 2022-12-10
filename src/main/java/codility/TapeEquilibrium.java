
package codility;

import static java.lang.Math.abs;
import static java.util.Arrays.stream;

public class TapeEquilibrium {
    public int solution(int[] tape) {
        var firstPart = tape[0];
        var secondPart = stream(tape).skip(1).sum();

        var theMinimalDifference = getDifferenceBetween(firstPart, secondPart);

        for (var p = 1; p < tape.length - 1; p++) {
            firstPart += tape[p];
            secondPart -= tape[p];

            var difference = getDifferenceBetween(firstPart, secondPart);
            if (difference < theMinimalDifference) {
                theMinimalDifference = difference;
            }
        }

        return theMinimalDifference;
    }

    private static int getDifferenceBetween(int firstPart, int secondPart) {
        return abs(firstPart - secondPart);
    }
}
