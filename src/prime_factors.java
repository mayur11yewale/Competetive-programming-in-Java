
public class prime_factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=288;
		while(x>0)
			{
				for (int i = 2; i <= x; i++)
				{
					if(x%i==0)
						{
							System.out.print(i+" ");
							x=x/i;
							i=2;
						}
				}
			}
	}
}
