import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertionDemo {
	
		@Test
		public void simple()
		{
			String A = "Zubeir";
			String B = "Zubeir";
		 	assertEquals(A, B);
		}
		@Test
     	public void simple1()
		{
			String A = "Zubeir";
			String B = "Kalpesh";
			assertEquals(A, B);
			}
		@Test
		public void simple2()
		{
			String A = "Shankar";
			String B = "Zubeir";
			assertEquals(A, B);
			}
		}
