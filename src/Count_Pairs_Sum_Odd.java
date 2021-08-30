import java.util.HashSet;

public class Count_Pairs_Sum_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={9,14,6,2,11};
		int arr2[]={8,4,7,20};
		int count=0;
		HashSet<Integer> obj=new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i;j<arr2.length;j++)
			{
				if(!(obj.contains(arr2[j]))){
				if(((arr1[i]+arr2[j])%2==1))
				{
					count++;
				}
				}
				obj.add(arr1[i]);
				obj.add(arr2[j]);
			}
		}

		System.out.println(count);
	}

}
