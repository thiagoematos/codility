package codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OddOccurrencesInArrayTest {

    private static Stream<Arguments> dataGenerator() {
        return Stream.of(
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{2, 2, 1}, 1),
                Arguments.of(new int[]{2, 2, 2}, 2),
                Arguments.of(new int[]{9, 3, 9, 3, 9, 7, 9}, 7)
        );
    }

    @ParameterizedTest
    @MethodSource("dataGenerator")
    void testForOddOccurrencesInArray(int[] input, int expectedResult) {
        var result = new OddOccurrencesInArray().solution(input);
        assertEquals(expectedResult, result);
    }
}
