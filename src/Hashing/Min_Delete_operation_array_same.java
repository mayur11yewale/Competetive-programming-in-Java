package Hashing;

import java.util.Arrays;

public class Min_Delete_operation_array_same {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4, 3, 4, 4, 2, 4};
		int arr1[]=new int[100];
		for(int i=0;i<arr.length;i++)
		{
			arr1[arr[i]]++;
		}
		Arrays.sort(arr1);
		int sum=0;
		System.out.println(arr.length-arr1[99]);
	}

}
