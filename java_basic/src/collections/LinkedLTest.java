package collections;

import static org.junit.Assert.*;

import org.junit.Test;

import arrays.Arrays;

public class LinkedLTest {

	@Test
	public void test() {
		LinkedL b= new LinkedL();
		b.getMenu();
	     b.showMenu();
	      assertEquals(b.showMenu(), 1);     

	}

}
