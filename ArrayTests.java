import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

@Test 
	public void testReverseInPlace2() {
    int[] input1 = { 3, 7, 8 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 8, 7, 3}, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverse() {
    int[] input1 = {2, 5, 7, 9, 13};
    assertArrayEquals(new int[]{13, 9, 7, 5, 2}, ArrayExamples.reversed(input1));
  }
}
