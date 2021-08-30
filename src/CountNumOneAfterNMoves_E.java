
public class CountNumOneAfterNMoves_E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;//num=10 answer is 3
		int count=0;
		/*int arr[]=new int[num];
		for(int i=0;i<num;i++)arr[i]=i+1;
		for(int i=0;i<num;i++)
		{
			double x=Math.sqrt(arr[i]);
			if(x-Math.floor(x)==0)count++;
		}
	*/	//to find perfect sqrt bewtween 1 and num
		//Time Complexity: O(log(log N))
		System.out.println(Math.floor(Math.sqrt(num)) - Math.ceil(Math.sqrt(1)) + 1);
	}

}
