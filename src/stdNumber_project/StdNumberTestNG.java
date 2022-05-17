package stdNumber_project;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
class StdNumberTestNG {

	private StdNumber stdNumber;
	@BeforeMethod
	void setUp() throws Exception {
		this.stdNumber = new StdNumber();
	}
	
	@Test
	void test1() {
		Assert.assertEquals(Boolean.FALSE , this.stdNumber.checkStdNum(1), "Failed Test");
	}
	
	@Test
	void test11() {
		Assert.assertEquals( Boolean.TRUE ,this.stdNumber.checkStdNum(1), "Failed Test");
	}
	
	@Test
	void test2() {
		Assert.assertEquals(Boolean.FALSE , this.stdNumber.checkStdNum(-1), "Failed Test");
	}
	
	@Test
	void test3() {
		Assert.assertEquals(Boolean.FALSE , this.stdNumber.checkStdNum(0), "Failed Test");
	}
	
	@Test
	void test4() {
		Assert.assertEquals(Boolean.FALSE , this.stdNumber.checkStdNum(120090000), "Failed Test");
	}
	
	@Test
	void test5() {
		Assert.assertEquals(Boolean.TRUE, this.stdNumber.checkStdNum(120100000), "Failed Test");
	}
	
	@Test
	void test6() {
		Assert.assertEquals(Boolean.FALSE , this.stdNumber.checkStdNum(320090000), "Failed Test");
	}
	
	@Test
	void test7() {
		Assert.assertEquals(Boolean.FALSE , this.stdNumber.checkStdNum(320100000), "Failed Test");
	}
	
	@Test
	void test8() {
		Assert.assertEquals(Boolean.FALSE , this.stdNumber.checkStdNum(220090000), "Failed Test");
	}
	
	@Test
	void test9() {
		Assert.assertEquals(Boolean.TRUE , this.stdNumber.checkStdNum(220100000), "Failed Test");
	}
	
	@Test
	void test10() {
		Assert.assertEquals(Boolean.TRUE, this.stdNumber.checkStdNum(220207007), "Failed Test");
	}
}