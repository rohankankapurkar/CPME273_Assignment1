package generics;

import static org.junit.Assert.*;



import org.junit.Test;

public class SortTest {


	@Test
	public void test() {
        Sort firstsort = new Sort();
        Integer[] a = {1,5,4,3,7};
        firstsort.sort(a);
        assertEquals(0, firstsort.sort(a));

	}

}
