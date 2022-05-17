package stdNumber_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class StdNumberV2Test {

	private StdNumberV2 stdNumber;
	@BeforeEach
	void setUp() throws Exception {
		this.stdNumber = new StdNumberV2();
	}

	@Test
	void test1() {
		assertEquals(false, this.stdNumber.checkStdNum(1));
	}
	
	@Test
	void test2() {
		assertEquals(false, this.stdNumber.checkStdNum(-1));
	}
	
	@Test
	void test3() {
		assertEquals(false, this.stdNumber.checkStdNum(0));
	}
	
	@Test
	void test4() {
		assertEquals(false, this.stdNumber.checkStdNum(120090000));
	}
	
	@Test
	void test5() {
		assertEquals(true, this.stdNumber.checkStdNum(120100000));
	}
	
	@Test
	void test6() {
		assertEquals(false, this.stdNumber.checkStdNum(320090000));
	}
	
	@Test
	void test7() {
		assertEquals(false, this.stdNumber.checkStdNum(320100000));
	}
	
	@Test
	void test8() {
		assertEquals(false, this.stdNumber.checkStdNum(220090000));
	}
	
	@Test
	void test9() {
		assertEquals(true, this.stdNumber.checkStdNum(220100000));
	}
	
	@Test
	void test10() {
		assertEquals(true, this.stdNumber.checkStdNum(220207007));
	}
}
