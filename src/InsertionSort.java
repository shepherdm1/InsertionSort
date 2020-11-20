
/*
Group 2:
Michael Shepherd
Tania Sajjad
William Marchesi
*/


public class InsertionSort {

	public static int[] sort(int[] input) {
		
		for (int i = 1; i < input.length - 1; i++) {
			int v = input[i];
			int j = i-1;
			
			while (j >= 0 && input[j] > v) {
				input[j+1] = input[j];
				j = j-1;
			}
			
			input[j+1] = v;
		}
		
		return input;
	}
	
	public static void main(String[] args) {
		int[] toSort = {34, 56, 11, 22, 55, 98, 43, 67};
		
		int[] out = sort(toSort);
		
		for (int num : out) {
			System.out.println(num);
		}

	}

}
