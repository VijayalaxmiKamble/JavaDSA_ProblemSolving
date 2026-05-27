package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class PrintReapetedElementFrom2SortedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first array size:");
        int n1 = scan.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter array elements in (Assending Order):");
        for (int i = 0; i < arr1.length; i++) 
        {
            arr1[i] = scan.nextInt();
        }
        System.out.println("Enter second array size:");
        int n2 = scan.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter array elements in (Assending Order):");
        for (int i = 0; i < arr2.length; i++) 
        {
            arr2[i] = scan.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length)
        {
        		if(arr1[i]==arr2[j])
        		{
        			System.out.println(arr1[i]);
        			i++;j++;
        		}
        		else if(arr1[i]>arr2[j])
        		{
        			j++;
        		}
        		else
        		{
        			i++;
        		}
        }
        
	}

}
