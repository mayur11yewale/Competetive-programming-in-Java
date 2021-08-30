package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class Duplicate_elements_K_distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {1, 2, 3, 1, 4, 5};
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	    
	    int k = scanner.nextInt();
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	    
	    int[] arr = new int[n];
	    String[] scoresItems = scanner.nextLine().split(" ");
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	    
	    for (int i = 0; i < n; i++) 
	    {
	        int scoresItem = Integer.parseInt(scoresItems[i]);
	        arr[i] = scoresItem;
	    }
		
		
		boolean b=false;
		HashMap<Integer,Integer> obj=new HashMap<Integer,Integer>();
		HashSet<Integer> obj1=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!obj.containsKey(arr[i]))obj.put(arr[i], i);
			else
			{
				int num=i-obj.get(arr[i]);
				if(num<=k)
					{
						b=true;
						obj1.add(arr[i]);
					}
			}
		}
		System.out.println(b);
		Iterator itr=obj1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
