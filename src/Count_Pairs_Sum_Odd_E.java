
public class Count_Pairs_Sum_Odd_E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={9,14,6,2,11};
		int arr2[]={8,4,7,20};
		int count=0;
		int odd1=0,even1=0;
		int odd2=0,even2=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]%2==1)odd1++;
			else even1++;
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]%2==1)odd2++;
			else even2++;
		}
		
		System.out.println(Math.min(odd1, even2)+Math.min(odd2, even1));
	}

}
