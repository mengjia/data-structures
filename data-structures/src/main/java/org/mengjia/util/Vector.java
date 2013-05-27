package org.mengjia.util;

public class Vector<T> {
	
	private final static int DEFAULT_LENGTH = 10;
	private int length;
	private Object[] data;
	
	public Vector()  {
		this(DEFAULT_LENGTH);
	}
	
	public Vector(int initLength) {
		this.length = initLength;
		this.data = new Object[this.length];
		
	}

	public void set(int index,T value) {
		
		if(index < length) {
			data[index] = value;
		}
		else if(index == Integer.MAX_VALUE) {
			throw new IllegalArgumentException("index must less than " + Integer.MAX_VALUE);
		}
		else {
			int newLength = index + 1;
			
			Object[] newData = new Object[newLength];
			for(int i = 0; i< this.length; i++) {
				newData[i] = data[i];
			}
			this.length = newLength;
			this.data = newData;
		}
	}
	@SuppressWarnings("unchecked")
	public T get(int index) {
		if(index >= this.length)
			return null;
		else
			return (T)data[index];
	}
	
	
}
