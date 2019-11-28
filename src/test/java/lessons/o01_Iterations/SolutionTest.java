package lessons.o01_Iterations;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution;

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void solution9() {
        // 1001
        assertThat(solution.solution(9), equalTo(2));
    }

    @Test
    public void solution529() {
        // 1000010001
        assertThat(solution.solution(529), equalTo(4));
    }

    @Test
    public void solution20() {
        // 10100
        assertThat(solution.solution(20), equalTo(1));
    }

    @Test
    public void solution32() {
        // 100000
        assertThat(solution.solution(32), equalTo(0));
    }

    @Test
    public void solution1041() {
        // 10000010001
        assertThat(solution.solution(1041), equalTo(5));
    }

    @Test(expected = Test.None.class)
    public void solution_max() {

        solution.solution(2147483647);
    }

    @Test
    public void solution328() {
        // 101001000
        assertThat(solution.solution(328), equalTo(2));
    }

    @Test
    public void solution1162() {
        // 10010001010
        assertThat(solution.solution(1162), equalTo(3));
    }

    @Test
    public void solution51712() {
        // 110010100000000
        assertThat(solution.solution(51712), equalTo(2));
    }

    @Test
    public void binaryGap11111() {
        assertThat(solution.binaryGap("11111"), equalTo(0));
    }

    @Test
    public void binaryGap0000() {
        assertThat(solution.binaryGap("0000"), equalTo(0));
    }

    @Test
    public void binaryGap101() {
        assertThat(solution.binaryGap("101"), equalTo(1));
    }

    @Test
    public void binaryGap1010010() {
        assertThat(solution.binaryGap("1010010"), equalTo(2));
    }

    @Test
    public void binaryGap01000010010() {
        assertThat(solution.binaryGap("01000010010"), equalTo(4));
    }
}