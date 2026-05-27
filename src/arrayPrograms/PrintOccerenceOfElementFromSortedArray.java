package arrayPrograms;

import java.util.Scanner;

public class PrintOccerenceOfElementFromSortedArray 
{
	public static void main(String ars[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements in (Assending Order):");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = scan.nextInt();
        }
        int count = 1;
        for(int i=0; i<arr.length-1; i++)
        {
        		if(arr[i]==arr[i+1])
        		{
        			count++;
        		}
        		else
        		{
        			System.out.println(arr[i]+"-"+count);
        			count = 1;
        		}
        }
        System.out.println(arr[arr.length-1]+"-"+count);
	}
}
