package codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.IntStream.rangeClosed;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingIntegerTest {

    private static Stream<Arguments> dataGenerator() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 6, 4, 1, 2}, 5),
                Arguments.of(new int[]{1, 2, 3}, 4),
                Arguments.of(new int[]{-1, -3}, 1),
                Arguments.of(rangeClosed(1, 5_000_000).toArray(), 5_000_001)
        );
    }

    @ParameterizedTest(name = "The missing integer for {0} should be {1}.")
    @MethodSource("dataGenerator")
    void testForMissingInteger(int[] input, int expectedResult) {
        var result = new MissingInteger().solution(input);
        assertEquals(expectedResult, result);
    }
}
