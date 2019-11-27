package lessons.o01_Iterations;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution;

    @Before
    void init() {
        solution = new Solution();
    }

    @Test
    void solution_9_1001(String teste) {

        assertThat(solution.solution(9), equalTo(2));
        assertThat(teste.equals("s"), equalTo(Boolean.TRUE));
    }

    @Test
    void solution_529_1000010001() {
        assertThat(solution.solution(529), equalTo(4));
    }

    @Test
    void solution_20_10100() {
        assertThat(solution.solution(20), equalTo(1));
    }

    @Test
    void solution_32_100000() {
        assertThat(solution.solution(32), equalTo(0));
    }

    @Test
    void solution_1041_10000010001() {
        assertThat(solution.solution(1041), equalTo(5));
    }

    //@Test(expected = Test.None.class)
    void solution_max() {
        solution.solution(2147483647);
    }

}