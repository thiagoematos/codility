package codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.IntStream.generate;
import static java.util.stream.IntStream.rangeClosed;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MaxCountersTest {
    private static Stream<Arguments> dataGenerator() {
        return Stream.of(
                Arguments.of(5, new int[]{0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0}),
                Arguments.of(1, new int[]{2, 1, 1, 2, 1}, new int[]{3}),
                Arguments.of(1, new int[]{1, 2, 1, 1, 2, 1, 2}, new int[]{4}),
                Arguments.of(2, new int[]{1, 2, 3, 1, 2, 3, 1}, new int[]{3, 2}),
                Arguments.of(2, new int[]{2, 1, 3, 2, 1, 2, 2, 1, 3, 2}, new int[]{4, 5}),
                Arguments.of(5, new int[]{3, 4, 4, 6, 1, 4, 4}, new int[]{3, 2, 2, 4, 2}),
                Arguments.of(5_000_000, rangeClosed(1, 5_000_000).toArray(), generate(() -> 1).limit(5_000_000).toArray()),
                Arguments.of(5_000_000, rangeClosed(1, 5_000_001).toArray(), generate(() -> 1).limit(5_000_000).toArray())
        );
    }

    @ParameterizedTest(name = "N={0} A={1} MaxCounters={2}")
    @MethodSource("dataGenerator")
    void testForMaxCounters(int N, int[] A, int[] expectedResult) {
        var result = new MaxCounters().solution(N, A);
        assertArrayEquals(expectedResult, result);
    }
}
