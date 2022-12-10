package codility;

import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class OddOccurrencesInArray {
    public int solution(int[] input) {
        return IntStream.of(input).boxed()
                .collect(groupingBy(identity(), counting()))
                .entrySet()
                .stream()
                .filter(isEven())
                .findFirst()
                .map(Map.Entry::getKey)
                .orElseThrow();
    }

    private static Predicate<Map.Entry<Integer, Long>> isEven() {
        return entry -> entry.getValue() % 2 == 1;
    }
}
