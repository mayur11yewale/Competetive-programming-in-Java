package DynamicPro;

public class Fibbonacci_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib[]=new int[10];
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<10;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
		}
		System.out.println(fib[9]);
	}

}
