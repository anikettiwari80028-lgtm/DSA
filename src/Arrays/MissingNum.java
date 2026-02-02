package Arrays;

public class MissingNum {
	public static void main(String[] args) {
		
		  int[] arr = {1, 2, 4, 5, 6,7,8,9}; 
		  int n = arr.length + 1;  
		  int sum = n * (n + 1) / 2;
		  int arraySum = 0;
	     
	      for (int str : arr) {
	           arraySum += str;
	      }

	      int missing = sum-arraySum;
	      System.out.println("Missing number is: " + missing);
	  
	  }
}
