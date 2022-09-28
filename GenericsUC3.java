package day_13_assignment;

public class GenericsUC3 {
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
	      
	      System.out.printf("Max of %s, %s and %s is %s\n","Apple",
	         "Peach", "Banana", maximum("Apple", "Peach", "Banana"));
	   }
}
