package Hashing;

import java.util.Arrays;

public class Equalize_the_array {
	static int equalizeArray(int[] arr) {

        int arr1[]=new int[101];
        for(int i=0;i<arr.length;i++)
        {
            arr1[arr[i]]++;
        }
        Arrays.sort(arr1);
        int sum=0;
        for(int i=0;i<arr1.length;i++)
            sum=sum+arr1[i];
        int x=sum-arr1[100];
        return x;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 3, 4, 4, 2, 4};
		int x=equalizeArray(arr);
		System.out.println(x);
	}

}
