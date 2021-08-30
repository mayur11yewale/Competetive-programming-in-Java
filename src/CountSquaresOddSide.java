import java.util.Scanner;

public class CountSquaresOddSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		int y=4;
		int num=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int count=0;
		if(num%2==0)
		{
			for(int i=2;i<=num;i=i+2)
			{
				count=count+i*i;
			}
		}
		else
		{
			for(int i=1;i<=num;i=i+2)
			{
				count=count+i*i;
			}
		}
		System.out.println(count);
	}

}
