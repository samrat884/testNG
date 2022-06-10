package Tutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo2 {
	@Test(priority=0)
	public void testa() {
		Assert.assertEquals(12, 12);
	}
	@Test(priority=2)
	public void testb() {
		Assert.assertEquals(12, 12);
		}
	@Test
	public void testt() {
		Assert.assertEquals(12, 12);
	}
	@Test
	public void testz() {
		Assert.assertEquals(12, 12);
	}

}
