package org.mengjia.util;


import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class ListTest {
	
	@Test
	public void testNewList() {
		List<Integer> list = new	List<Integer>();
		Assert.assertNotNull(list);
		Assert.assertEquals(0, list.size());
	}
	
	@Test
	public void testAdd() {
		List<Integer> list = new	List<Integer>();
		list.add(1);
		Assert.assertEquals(list.get(0).intValue(),1);
	}
	
	@Test
	public void testSet() {
		List<Integer> list = new	List<Integer>();
		list.set(1, 100);
		Assert.assertEquals(list.get(1).intValue(),100);
	}
	
	@Test
	public void testIterator() {
		List<Integer> list = new	List<Integer>();
		list.add(1);
		list.add(2);
		Iterator<Integer> iters = list.iterator();
		Assert.assertNotNull(iters);
		

	}
}
