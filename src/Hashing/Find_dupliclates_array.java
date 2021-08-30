package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Find_dupliclates_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {12, 11, 40, 12, 5, 6, 5, 12, 11};
		 HashMap<Integer,Integer> obj=new HashMap<>();
		 int count=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(!obj.containsKey(arr[i]))
			 {
				 obj.put(arr[i], 1);
			 }
			 else
			 {
				 count=obj.get(arr[i]);
				 obj.put(arr[i], count+1);
			 }
		 }
		 for(Map.Entry<Integer,Integer> entry : obj.entrySet())
		 {
			 if(entry.getValue()>1)
			 {
				 System.out.print(entry.getKey()+" ");
			 }
		 }
		 
	}

}
