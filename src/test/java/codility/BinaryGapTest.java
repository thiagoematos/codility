package codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryGapTest {

    @ParameterizedTest(name = "{index} => Binary Gap of ''{0}'' should be ''{1}''")
    @CsvSource({"9,2", "529,4", "20,1", "15,0", "32,0"})
    void testForBinaryGap(int N, int expectedResult) {
        var result = new BinaryGap().solution(N);
        assertEquals(expectedResult, result);
    }
}
