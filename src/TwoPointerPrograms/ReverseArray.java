package TwoPointerPrograms;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
		int start = 0;
		int end = arr.length-1;
		while(start<end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
