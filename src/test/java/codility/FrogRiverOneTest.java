package codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.IntStream.rangeClosed;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FrogRiverOneTest {
    private static Stream<Arguments> dataGenerator() {
        return Stream.of(
                Arguments.of(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}, 6),
                Arguments.of(2, new int[]{2, 1}, 1),
                Arguments.of(1, new int[]{1}, 0),
                Arguments.of(5_000_000, rangeClosed(1, 5_000_000).toArray(), 4_999_999)
        );
    }

    @ParameterizedTest(name = "The frog want to get to position {0}. The leaves fallen according {1}. The earliest time is {2}.")
    @MethodSource("dataGenerator")
    void testForFrogRiverOne(int X, int[] A, int expectedResult) {
        var result = new FrogRiverOne().solution(X, A);
        assertEquals(expectedResult, result);
    }
}
