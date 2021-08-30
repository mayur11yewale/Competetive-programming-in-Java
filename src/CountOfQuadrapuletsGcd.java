
public class CountOfQuadrapuletsGcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l=2,r=8,k=4;
		int count=0;
		//Time Complexity: O(N^4)
		for(int x=l;x<=r;x++)
		{
			for(int x1=l;x1<=r;x1++)
			{
				for(int x2=l;x2<=r;x2++)
				{
					for(int x3=l;x3<=r;x3++)
					{
						if(gcd(x,x1,x2,x3)==5)count++;
					}
				}
			}
		}
		System.out.println(count);
	}
	
	static int gcd(int a,int b,int c,int d)
	{
		int num=0;
		for(int i = 1; i <= a && i <= b && i <= c && i <= d; i++)
        {
            if(a%i==0 && b%i==0 && c%i==0 && d%i==0)
                num = i;
        }
		return num;
	}

}
