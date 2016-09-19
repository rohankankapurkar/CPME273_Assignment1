package queues;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class ClassTest {

	@Test
	public void testCollectionAdd() {
		Queue<String>  q = new LinkedList < String > () ; 
	    assertEquals(0, q.size());
	    q.add("273");
	    assertEquals(1, q.size());
	    q.add("202");
	    assertEquals(2, q.size());
	}


}
