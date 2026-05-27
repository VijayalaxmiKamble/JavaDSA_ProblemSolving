package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Merge2SortedArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first array size:");
        int n1 = scan.nextInt();

        int arr1[] = new int[n1];

        System.out.println("Enter first array elements:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }

        System.out.println("Enter second array size:");
        int n2 = scan.nextInt();

        int arr2[] = new int[n2];

        System.out.println("Enter second array elements:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int res[] = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        // Merge arrays
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                res[k] = arr1[i];
                i++;
            } else {
                res[k] = arr2[j];
                j++;
            }

            k++;
        }

        // Remaining elements of arr1
        while (i < arr1.length) {
            res[k] = arr1[i];
            i++;
            k++;
        }

        // Remaining elements of arr2
        while (j < arr2.length) {
            res[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println("Merged Array:");

        for (int e = 0; e < res.length; e++) {
            System.out.print(res[e] + " ");
        }
    }
}