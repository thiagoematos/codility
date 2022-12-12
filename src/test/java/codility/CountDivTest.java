package codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountDivTest {

    @ParameterizedTest(name = "A={0} B={1} K={2} Result={3}")
    @CsvSource(quoteCharacter = '"', textBlock = """
            # A,             B,  K,  Result
              6,            11,  2,  3
              1, 2_000_000_000,  1,  2_000_000_000
            """)
    void testForCountDiv(int A, int B, int K, int expectedResult) {
        var result = new CountDiv().solution(A, B, K);
        assertEquals(expectedResult, result);
    }
}
