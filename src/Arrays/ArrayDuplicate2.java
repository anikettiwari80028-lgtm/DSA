package Arrays;

public class ArrayDuplicate2 {
	public static void main(String[] args) {
		int arr[] = { 7, 8, 9, 5, 8, 7, 4, 1, 2, 5, 8, 7, 9, 6, 5 };
		
		for (int i = 0; i < arr.length - 1; i++) {
			boolean isDuplicate=false;
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
                    isDuplicate=true;
                  
				}
			}
			if(!isDuplicate) {
				System.out.println(arr[i]);
			}
		}
	}
}
