package org.kodluyoruz;

public interface Queue <T> extends Iterable <T>  {
	
	public void add(T t);
	public T poll();
	public T peek();

}
