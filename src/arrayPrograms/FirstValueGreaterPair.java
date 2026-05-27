package arrayPrograms;

import java.util.Scanner;

public class FirstValueGreaterPair {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = scan.nextInt();
        }
        for(int i=0; i<arr.length-1; i++)
        {
        		for(int j=i+1; j<arr.length; j++)
        		{
        			if(arr[i]>arr[j])
        			{
        				System.out.println(arr[i]+","+arr[j]);
        			}
        		}
        }
        
	}

}
