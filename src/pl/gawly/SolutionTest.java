package pl.gawly;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testOne() {
        Assert.assertEquals(0, s.solution(1, 1, 1));
    }

    @Test
    public void testExample1() {
        Assert.assertEquals(3, s.solution(10, 85, 30));
    }

    @Test
    public void testExample2() {
        Assert.assertEquals(1, s.solution(2, 5, 3));
    }

    @Test
    public void testExample3() {
        Assert.assertEquals(0, s.solution(5, 5, 1));
    }

    @Test
    public void testExampleMax() {
        Assert.assertNotNull(s.solution(1000000000, 990000000, 1));
    }
}
