package Hashing;

import java.util.HashSet;

public class Array_Subset_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {11, 1, 13, 21, 3, 7};
		int arr2[] = {11, 3, 7, 10};
		HashSet<Integer>obj=new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			obj.add(arr1[i]);
		}
		boolean x=false;
		for(int i=0;i<arr2.length;i++)
		{
			if(obj.contains(arr2[i]))x=true;
			else x=false;
		}
		if(x)System.out.println("Yes");
		else System.out.println("No");
	}

}
