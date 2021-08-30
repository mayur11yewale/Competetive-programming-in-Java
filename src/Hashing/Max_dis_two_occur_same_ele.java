package Hashing;

import java.util.HashMap;

public class Max_dis_two_occur_same_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 7, 4, 2};
		HashMap<Integer,Integer> obj=new HashMap<Integer,Integer>();
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(!obj.containsKey(arr[i]))obj.put(arr[i],i);
			else 
			{
				max=Math.max(max, i-obj.get(arr[i]));
			}
		}
		System.out.println(max);
		char ch=(char)('a'+87);
			System.out.println(ch);
		
	}
	

}
