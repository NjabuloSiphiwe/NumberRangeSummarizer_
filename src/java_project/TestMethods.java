package java_project;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

public class TestMethods {
	@Test
	public void testCollect() {
	    NumberRangeSummarizerImpl summarizer = new NumberRangeSummarizerImpl();
	    Collection<Integer> result = summarizer.collect("1, 2, 3, 4, 5");
	    Collection<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
	    assertEquals(expected, result);

	    result = summarizer.collect("10, 20, 30, 40, 50");
	    expected = Arrays.asList(10, 20, 30, 40, 50);
	    assertEquals(expected, result);

	    result = summarizer.collect("1, 2, 3, 5, 8, 13");
	    expected = Arrays.asList(1, 2, 3, 5, 8, 13);
	    assertEquals(expected, result);
	}
	@Test
	public void testSummarizeCollection() {
	    NumberRangeSummarizerImpl summarizer = new NumberRangeSummarizerImpl();
	    Collection<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
	    String result = summarizer.summarizeCollection(input);
	    String expected = "1-5";
	    assertEquals(expected, result);

	    input = Arrays.asList(10, 20, 30, 40, 50);
	    result = summarizer.summarizeCollection(input);
	    expected = "10, 20, 30, 40, 50";
	    assertEquals(expected, result);

	    input = Arrays.asList(1, 2, 3, 5, 8, 13);
	    result = summarizer.summarizeCollection(input);
	    expected = "1-3, 5, 8, 13";
	    assertEquals(expected, result);
	}

}
