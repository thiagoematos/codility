package codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermMissingElemTest {

    private static Stream<Arguments> dataGenerator() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 1, 5}, 4),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10}, 6),
                Arguments.of(new int[]{2, 1}, 3),
                Arguments.of(new int[]{3, 1}, 2),
                Arguments.of(new int[]{2, 3}, 1),
                Arguments.of(new int[]{2}, 1),
                Arguments.of(new int[]{1}, 2),
                Arguments.of(new int[]{}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("dataGenerator")
    void testForPermMissingElem(int[] input, int missingElement) {
        var result = new PermMissingElem().solution(input);
        assertEquals(missingElement, result);
    }
}
