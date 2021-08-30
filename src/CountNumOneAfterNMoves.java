
public class CountNumOneAfterNMoves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int arr[]=new int[num];
		for(int i=0;i<num;i++)arr[i]=0;
		//Time Complexity: O(n^2)
		for(int i=0;i<num;i++)
		{
			int x=i;
			//System.out.print(i+" ");
			for( int j=x;j<num;j=j+(x+1))
			{
				//System.out.print(j+" ");
				if(arr[j]==1)arr[j]=0;
				else
				{
					arr[j]=1;
				}
			}
		}
		int sum=0;
		for(int i=0;i<num;i++)sum=sum+arr[i];
		System.out.println(sum);
	}

}
