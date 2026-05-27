package TwoPointerPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
		int copy[] = arr.clone();
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
		if(Arrays.equals(arr, copy))
		{
			System.out.println("Palidrome Array");
		}
		else
		{
			System.out.println("Not A Palidorme array");
		}
	}

}
