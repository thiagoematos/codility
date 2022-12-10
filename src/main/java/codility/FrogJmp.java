package codility;

import java.math.RoundingMode;

import static java.math.BigDecimal.valueOf;

public class FrogJmp {
    public int solution(int startPosition, int endPosition, int step) {
        var distance = endPosition - startPosition;

        if (distance == 0) {
            return 0;
        }

        if (step > distance) {
            return 1;
        }

        return valueOf(distance)
                .divide(
                        valueOf(step), RoundingMode.CEILING
                )
                .intValue();
    }
}
