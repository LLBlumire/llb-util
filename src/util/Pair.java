package util;

/**
 * A pair of values.
 * 
 * @author L. L. Blumire
 *
 * @param <A> The type of the first of the pair
 * @param <B> The type of the second of the pair
 */
public class Pair<A, B> {
	
	/**
	 * The first of the pair
	 */
	public A first;
	
	/**
	 * The second of the pair
	 */
	public B second;
	
	/**
	 * Constructor for pair
	 * @param first the first of the pair
	 * @param second the second of the pair
	 */
	public Pair(A first, B second) {
		this.first = first;
		this.second = second;
	}
}

/*
    Why on earth does java not have pair in it's standard libraries.
*/