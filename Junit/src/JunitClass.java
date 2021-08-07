import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.*;

public class JunitClass {
  @Test
  public void setup()
  {
    /*String s="this is klh";
    assertEquals("This is klh",s);
    */
	  
	 String s= "klh ss";
	 String s1 = "klh ss";
	 String s2 = "xyz";
	 String s3 = null;
	 String s4 ="xyz";
	 int val =5;
	 int val1 =7;
	 String[] expectedArray = {"one","two"};
	 String[] resultArray = {"one","two"};
//assertequals checks if two objects or primitives are equal
	 assertEquals(s,s1);
	 //assertrue checks the condtionn is true
	 assertTrue(val<val1);
	 
	 assertFalse(val1<val);
	 assertSame(s,s1);
	 assertNotSame(s,s2);
	 assertArrayEquals(expectedArray,resultArray);
	 assertNull(s3);
	 assertNotNull(s1);
	 
	 
}
}



