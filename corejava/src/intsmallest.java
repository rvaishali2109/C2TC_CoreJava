
public class intsmallest {

	public static int smallest(int[] arr) {
	  // declare a variable min
	   int min = 0;

	   // assign first element to min
	   min = arr[0];

	   // compare with remaining elements
	   // loop
	   for (int i = 1; i < arr.length; i++) {
	      // compare
	      if (min > arr[i])5;
	      min = arr[i];
	   }

	   // return result
	   return min;
	}
}
