package ss9_tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {
    @Test
    public void testSum1() {
      Demo demo = new Demo();
      long result = demo.sum(3,5);
      assertEquals(result, 8, "Đáp án của 3 + 5 phải bằng 8");
    }

    @Test
    public void testSum2() {
        Demo demo = new Demo();
        long result = demo.sum(2147483647,1);
        assertEquals(result, 2147483648L, "Đáp án của 3 + 5 phải bằng 8");
    }
}