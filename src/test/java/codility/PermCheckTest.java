package codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermCheckTest {

    private static Stream<Arguments> dataGenerator() {
        return Stream.of(
                Arguments.of(new int[]{1, 2}, true),
                Arguments.of(new int[]{2, 1}, true),
                Arguments.of(new int[]{1}, true),
                Arguments.of(new int[]{2}, false),
                Arguments.of(new int[]{1, 3}, false),
                Arguments.of(new int[]{3, 1}, false),
                Arguments.of(new int[]{2, 3}, false),
                Arguments.of(new int[]{3, 2}, false),
                Arguments.of(new int[]{1, 2, 3}, true),
                Arguments.of(new int[]{1, 3, 2}, true),
                Arguments.of(new int[]{3, 2, 1}, true)
        );
    }

    @ParameterizedTest(name = "Is {0} a permutation? R={1}")
    @MethodSource("dataGenerator")
    void testForPermCheck(int[] input, boolean expectedResult) {
        var result = new PermCheck().solution(input);
        assertEquals(expectedResult, result);
    }
}
