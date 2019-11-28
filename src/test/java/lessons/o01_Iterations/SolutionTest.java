package lessons.o01_Iterations;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    private Solution solution;

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void testSolution9() {
        // 1001
        assertThat(solution.solution(9)).isEqualTo(2);
    }

    @Test
    public void testSolution529() {
        // 1000010001
        assertThat(solution.solution(529)).isEqualTo(4);
    }

    @Test
    public void testSolution20() {
        // 10100
        assertThat(solution.solution(20)).isEqualTo(1);
    }

    @Test
    public void testSolution32() {
        // 100000
        assertThat(solution.solution(32)).isEqualTo(0);
    }

    @Test
    public void testSolution1041() {
        // 10000010001
        assertThat(solution.solution(1041)).isEqualTo(5);
    }

    @Test(expected = Test.None.class)
    public void testSolution_max() {

        solution.solution(2147483647);
    }

    @Test
    public void testSolution328() {
        // 101001000
        assertThat(solution.solution(328)).isEqualTo(2);
    }

    @Test
    public void testSolution1162() {
        // 10010001010
        assertThat(solution.solution(1162)).isEqualTo(3);
    }

    @Test
    public void testSolution51712() {
        // 110010100000000
        assertThat(solution.solution(51712)).isEqualTo(2);
    }

    @Test
    public void testBinaryGap11111() {
        assertThat(solution.binaryGap("11111")).isEqualTo(0);
    }

    @Test
    public void testBinaryGap0000() {
        assertThat(solution.binaryGap("0000")).isEqualTo(0);
    }

    @Test
    public void testBinaryGap101() {
        assertThat(solution.binaryGap("101")).isEqualTo(1);
    }

    @Test
    public void testBinaryGap1010010() {
        assertThat(solution.binaryGap("1010010")).isEqualTo(2);
    }

    @Test
    public void testBinaryGap01000010010() {
        assertThat(solution.binaryGap("01000010010")).isEqualTo(4);
    }
}