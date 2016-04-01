import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {
	private Triangle tr;
	protected long lborderA = 4;
	protected long lborderB = 4;
	protected long lborderC = 5;


	@Test
	public void testTriangle(){
		tr = new Triangle(lborderA,lborderB,lborderC);
		assertEquals(4,tr.lborderA);
		assertEquals(4,tr.lborderB);
		assertEquals(5,tr.lborderC);
	}
	
	@Test
	public void testdiffOfBorders(){
		tr = new Triangle(lborderA,lborderB,lborderC);
		long testVal1 = tr.diffOfBorders(lborderA, lborderB);
		long testVal2 = tr.diffOfBorders(lborderB, lborderC);
		long testVal3 = tr.diffOfBorders(lborderC, lborderA);
		assertEquals(0,testVal1);
		assertEquals(1,testVal2);
		assertEquals(1,testVal3);
	}
	
	@Test
	public void testisTriangle(){
		tr = new Triangle(lborderA,lborderB,lborderC);
		boolean testBoo = tr.isTriangle(tr);
		assertEquals(true,testBoo);
		tr = new Triangle(1,1,2);
		boolean testBoo1 = tr.isTriangle(tr);
		assertEquals(false,testBoo1);
		tr = new Triangle(0,1,2);
		boolean testBoo2 = tr.isTriangle(tr);
		assertEquals(false,testBoo2);
		tr = new Triangle(1000000000,1,2);
		boolean testBoo3 = tr.isTriangle(tr);
		assertEquals(false,testBoo3);
	}
	
	@Test
	public void testgetType(){
		tr = new Triangle(1,2,3);
		tr.isTriangle(tr);
		tr.getType(tr);
		
		String str1=tr.getType(new Triangle(2,2,3));
		assertEquals("Isosceles",str1);
		String str2=tr.getType(new Triangle(2,2,2));
		assertEquals("Regular",str2);
		String str3=tr.getType(new Triangle(7,8,9));
		assertEquals("Scalene",str3);
	}
	
	@Test
	public void testgetBorders(){
		tr = new Triangle(lborderA,lborderB,lborderC);
		long[] tempArr = {4,4,5};
		long[] testArr = tr.getBorders();
		assertArrayEquals(tempArr,testArr);
	}


}
