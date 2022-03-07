import static org.junit.Assert.*;

import org.junit.Test;



public class PassValidatorTest {

	@Test
	public void test() {
		 PassValidator ob=new PassValidator();

		 boolean res=ob.isValid("abcde12356789");

		 assertEquals(true,res);

	}

}
