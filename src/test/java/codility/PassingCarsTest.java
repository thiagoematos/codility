package codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PassingCarsTest {

    private static Stream<Arguments> dataGenerator() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1}, 14),
                Arguments.of(new int[]{0, 1, 0, 1, 1}, 5),
                Arguments.of(new int[]{1, 0}, 0),
                Arguments.of(new int[]{1, 1}, 0),
                Arguments.of(new int[]{0, 0}, 0),
                Arguments.of(new int[]{1}, 0)
        );
    }

    @ParameterizedTest(name = "Cars on the road {0}. Passing cars should be {1}.")
    @MethodSource("dataGenerator")
    void testForPassingCars(int[] carsOnTheRoad, int expectedResult) {
        var result = new PassingCars().solution(carsOnTheRoad);
        assertEquals(expectedResult, result);
    }
}
