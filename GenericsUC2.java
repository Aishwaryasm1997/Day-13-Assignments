package day_13_assignment;

public class GenericsUC2 {
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;   // assume x is initially the largest

		if(y.compareTo(max) > 0) {
			max = y;   // y is the largest so far
		}

		if(z.compareTo(max) > 0) {
			max = z;   // z is the largest now                 
		}
		return max;   // returns the largest object   
	}

	public static void main(String args[]) {
		System.out.printf("Max of %.1f, %.1f and %.1f is %.1f\n\n", 
				10.25, 4.2, 16.50, maximum( 10.25, 4.3, 16.50 ));
	}
}
	

