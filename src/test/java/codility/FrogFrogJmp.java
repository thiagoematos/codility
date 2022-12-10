package codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrogFrogJmp {

    @ParameterizedTest(name = "X={0} Y={1} D={2} Jumps={3}")
    @CsvSource(quoteCharacter = '"', textBlock = """
            # Start,  End,   Step,  Jumps
                  0,    1,      1,      1
                  0,    2,      1,      2
                  0,    2,      2,      1
                  0,    2,      3,      1
                  10,   85,     30,     3
                  1,    1,      1,      0
                  0,    38,     37,     2
            """)
    void testForFrogJmp(int X, int Y, int D, int expectedResult) {
        var result = new FrogJmp().solution(X, Y, D);
        assertEquals(expectedResult, result);
    }
}
