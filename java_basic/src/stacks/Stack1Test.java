package stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class Stack1Test {

	@Test
	public void test() {
		Stack1.SelectMenu();
	    assertEquals(10, Stack1.getMenu());
	    Stack1.SelectMenu();

	}

}
