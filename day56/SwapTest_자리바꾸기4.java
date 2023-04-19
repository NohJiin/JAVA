package 정렬;

import java.util.Arrays;

public class SwapTest_자리바꾸기4 {

	public static void main(String[] args) {
		String[] str = {"햄버거", "샌드위치", "커피"};
		print(str);
		swap(str, 0, 1); //햄버거, 샌드위치 바꾸어보세요.
	}
	
	public static void swap(String[] arr, int idx1, int idx2) {
		String temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		print(arr);
	}
	
	public static void print(int[] num) {
		System.out.println(Arrays.toString(num));
	}
	public static void print(String[] str) {
		System.out.println(Arrays.toString(str));
	}
}