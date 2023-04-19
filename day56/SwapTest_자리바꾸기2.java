package 정렬;

import java.util.Arrays;

public class SwapTest_자리바꾸기2 {

	public static void main(String[] args) {
		int[] num = {6,1,2,3,5,9};
		print(num);
		
		swap(num, 0, 5);	// swap(num, 0, 5)
		print(num);
	}
	
	public static void swap(int[] arr, int idx1, int idx2) {
		System.out.println(arr[idx1] + ", " + arr[idx2]);
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		System.out.println(arr[idx1] + ", " + arr[idx2]);
	}
	
	public static void print(int[] num) {
		System.out.println(Arrays.toString(num));
	}
	
	public static void print(String[] num) {
		System.out.println(Arrays.toString(num));
	}
}