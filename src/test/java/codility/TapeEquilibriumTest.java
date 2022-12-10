package codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TapeEquilibriumTest {

    private static Stream<Arguments> dataGenerator() {
        return Stream.of(
                Arguments.of(new int[]{-3, 1, 2, 0, 3}, 3),
                Arguments.of(new int[]{3, 1, 2, 4, 3}, 1),
                Arguments.of(new int[]{0, 3, 1, 2, 4, 3}, 1),
                Arguments.of(new int[]{-3, 1, 2, 4, 3}, 1),
                Arguments.of(new int[]{-3, 1}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("dataGenerator")
    void testForTapeEquilibrium(int[] tape, int expectedResult) {
        var result = new TapeEquilibrium().solution(tape);
        assertEquals(expectedResult, result);
    }
}

