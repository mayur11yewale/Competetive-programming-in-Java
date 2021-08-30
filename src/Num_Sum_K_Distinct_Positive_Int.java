
public class Num_Sum_K_Distinct_Positive_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=12;
		int K=4;
		//can be solve by equation n>=k*(k+1)/2
		for(int i=1;i<=K;i++)
		{
			N=N-i;
		}
		if(N<0)System.out.println("No");
		else System.out.println("Yes");
	}

}
