package org.mengjia.util;

import java.util.Iterator;

public class List<T> {

	public void add(T value) {
		
	}
	
	public void remove(T value) {
		
	}
	
	public void set(int index,T value) {
		
	}
	
	public T get(int index) {
		return null;
	}
	
	public int size() {
		return 0;
	}
	
	public Iterator<T> iterator() {
		return new Iterator<T>( ) {
			int index;

			@Override
			public boolean hasNext() {

				return index == this.size();
			}

			@Override
			public T next() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
	
	public T[] toArray() {
		return null;
	}


}
