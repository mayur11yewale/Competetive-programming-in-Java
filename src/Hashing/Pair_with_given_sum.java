package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Pair_with_given_sum {
	static void find(int arr[],int sum)
	{
		HashSet<Integer> obj=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			int temp=sum-arr[i];
			if(obj.contains(temp))
			{
				System.out.println(arr[i]+" "+temp);
				break;
			}
			obj.add(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1, 4, 45, 6, 10, -8}; 
	    int n = 16;
	    find(A,n);
	}

}
