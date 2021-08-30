
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=48,y=18;
		for(int i=1;i<x && i<y;i++)
		{
			if(x%i==0 && y%i==0)
			{
				int num=i;
				System.out.print(num+" ");
			}
		}
	}

}
