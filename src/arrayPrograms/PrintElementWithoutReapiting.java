package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class PrintElementWithoutReapiting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements in (Assending Order):");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++)
        {
        		if(arr[i]!=arr[i+1])
        		{
        			System.out.println(arr[i]);
        		}
        }
        System.out.println(arr[arr.length-1]);
	}

}
