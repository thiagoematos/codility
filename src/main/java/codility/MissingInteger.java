package codility;

import static java.util.stream.Collectors.toSet;
import static java.util.stream.IntStream.of;

public class MissingInteger {
    public int solution(int[] input) {
        var max = of(input).max().getAsInt();
        var inputAsSet = of(input).boxed().collect(toSet());

        for (var missing = 1; missing <= max; missing++) {
            if (!inputAsSet.contains(missing)) {
                return missing;
            }
        }

        if (max < 0) {
            return 1;
        }

        return max + 1;
    }
}
