package codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CyclicRotationTest {

    private static Stream<Arguments> dataGenerator() {
        return Stream.of(
                Arguments.of(new int[]{}, 1, new int[]{}),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 0, new int[]{1, 2, 3, 4, 5}),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 5, new int[]{1, 2, 3, 4, 5}),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 5, new int[]{1, 2, 3, 4, 5}),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 1, new int[]{5, 1, 2, 3, 4}),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 2, new int[]{4, 5, 1, 2, 3}),
                Arguments.of(new int[]{3, 8, 9, 7, 6}, 3, new int[]{9, 7, 6, 3, 8})
        );
    }

    @ParameterizedTest
    @MethodSource("dataGenerator")
    void testForCyclicRotation(int[] input, int k, int[] output) {
        var result = new CyclicRotation().solution(input, k);
        assertArrayEquals(output, result);
    }
}
