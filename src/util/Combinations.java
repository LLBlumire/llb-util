package util;

import java.util.Iterator;
import java.util.List;
import java.lang.Iterable;

/**
 * Provides a combinations iterator, supplying all the possible combinations of elements in a List
 * 
 * @author L. L. Blumire
 *
 * @param <T> The underlying type of the List
 */
public class Combinations<T> implements Iterator<Pair<T, T>>, Iterable<Pair<T, T>>{

	/**
	 * The underlying data being accessed.
	 */
	List<T> data;
	
	/**
	 * The head index of the list, where the first element is taken from.
	 */
	int head;
	
	/**
	 * The tail index of the list, where the second element is taken from.
	 */
	int tail;
	
	/**
	 * Constructor for Combinations
	 * @param data The underlying data to query
	 * @throws IndexOutOfBoundsException when the data contains under 2 elements.
	 */
	public Combinations(List<T> data) {
		if (data.size() < 2) throw new IndexOutOfBoundsException();
		this.data = data;
		this.head = 0;
		this.tail = 1;
	}
	
	@Override
	public boolean hasNext() {
		return (this.head < this.data.size() - 1);
	}

	@Override
	public Pair<T, T> next() {
		if (this.hasNext()) {
			Pair<T, T> result = new Pair<T, T>(this.data.get(this.head), this.data.get(this.tail));
			if (this.tail < this.data.size() - 1) {
				++this.tail;
			} else {
				++this.head;
				this.tail = this.head + 1;
			}
			return result;
		} else {
			return null;
		}
	}

	@Override
	public Iterator<Pair<T, T>> iterator() {
		// TODO Auto-generated method stub
		return this;
	}

}
