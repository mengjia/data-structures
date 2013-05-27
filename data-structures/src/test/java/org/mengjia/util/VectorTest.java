package org.mengjia.util;

import org.junit.Assert;
import org.junit.Test;

public class VectorTest {

	@Test
	public void testVector() {
		Vector<Integer> v = new Vector<Integer>();
		Assert.assertNotNull(v);
	}
	
	@Test
	public void testVectorWithLength() {
		int length = 20;
		Vector<Integer> v = new Vector<Integer>(length);
		Assert.assertNotNull(v);
	}
	
	@Test
	public void testSetData() {
		Vector<Integer> v = new Vector<Integer>();
		v.set(1, 100);
		Assert.assertEquals(100, v.get(1).intValue());
	}
	
	@Test
	public void testSetData2() {
		Vector<Integer> v = new Vector<Integer>();
		v.set(Integer.MAX_VALUE-1, 100);
		Assert.assertEquals(100, v.get(Integer.MAX_VALUE-1).intValue());
	}
	
}
