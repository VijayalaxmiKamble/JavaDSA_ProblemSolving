package TwoPointerPrograms;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int arr[] = new int[n];

		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}

		System.out.println("How much element u want to shift :");
		int k = scan.nextInt();

		int rotate = 0;

		while(rotate < k)
		{
			int last = arr[arr.length - 1];

			for(int i = arr.length - 1; i > 0; i--)
			{
				arr[i] = arr[i - 1];
			}

			arr[0] = last;

			rotate++;
		}

		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}