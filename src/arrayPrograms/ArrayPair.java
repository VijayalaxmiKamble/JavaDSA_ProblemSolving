// GitHub contribution update
package arrayPrograms;

import java.util.Scanner;

public class ArrayPair {
	public static void main(String ars[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = scan.nextInt();
        }
        //System.out.println("Enter array pair size:");
        //int k = scan.nextInt();
        for(int i=0; i<arr.length; i++)
        {
	        	for(int j=i+1; j<arr.length; j++)
	        	{
	        		System.out.println(arr[i]+","+arr[j]);
	        		break;
	        	}
        }
	}
}
