package lessons.o01_Iterations;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class SolutionTest {

    private Solution solution;

    @Test
    @Parameters({
            "9, 2",
            "529, 4",
            "20, 1",
            "32, 0",
            "1041, 5",
            "328, 2",
            "1162, 3",
            "51712, 2"
    })
    public void testSolutions(int number, int result) {
        assertThat(solution.solution(number)).isEqualTo(result);
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test(expected = Test.None.class)
    public void testSolutionMax() {
        solution.solution(2147483647);
    }

    @Test
    @Parameters({
            "11111, 0",
            "0000, 0",
            "101, 1",
            "1010010, 2",
            "01000010010, 4"
    })
    public void testBinaryGap(String value, int result) {
        assertThat(solution.binaryGap(value)).isEqualTo(result);
    }

}