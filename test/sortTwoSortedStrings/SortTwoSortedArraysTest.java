package sortTwoSortedStrings;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SortTwoSortedArraysTest {
	private SortTwoSortedArrays sortTwo;

	@Before
	public void setUp() throws Exception {
		sortTwo = new SortTwoSortedArrays();
	}

	@Test
	public void sortArraysWithOneElement() throws Exception{
		String[] array1 = {"c"};
		String[] array2 = {"b"};
		
		String[] sortedArray = sortTwo.sort(array1, array2);
		
		
		assertArrayEquals(new String[]{"b","c"}, sortedArray );
		
	}
	
	@Test
	public void sortArraysWithMultipleElements() throws Exception{
		String[] array1 = {"a","b","c"};
		String[] array2 = {"d","e","f"};
		
		String[] sortedArray = sortTwo.sort(array1, array2);
		
		
		assertArrayEquals(new String[]{"a","b","c","d","e","f"}, sortedArray );
		
	}
	
	
	@Test
	public void sortArraysWithDuplicateElements() throws Exception {
		String[] array1 = {"d","e","f"};
		String[] array2 = {"d","e","f"};
		
		String[] sortedArray = sortTwo.sort(array1, array2);
		
		
		assertArrayEquals(new String[]{"d","d","e","e","f","f"}, sortedArray );
		
	}
	
	@Test
	public void sortArraysWithNonConcurrentElements() throws Exception {
		String[] array1 = {"d","m","x"};
		String[] array2 = {"a","g","v"};
		
		String[] sortedArray = sortTwo.sort(array1, array2);
		
		
		assertArrayEquals(new String[]{"a","d","g","m","v","x"}, sortedArray );
		
	}

}
