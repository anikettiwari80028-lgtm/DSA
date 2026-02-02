package Arrays;

public class RemoveDuplicate1 {
	public static void main(String[] args) {
		int[] arr = { 8, 8, 8, 7, 6, 5, 7, 8, 8 };
		boolean visited[] = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (visited[i])
				continue;
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}
			System.out.print(arr[i] + " ");
		}
	}
}
