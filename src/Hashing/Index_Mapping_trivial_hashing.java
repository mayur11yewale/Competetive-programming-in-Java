package Hashing;

public class Index_Mapping_trivial_hashing {
	final static int MAX = 1000; 
	static boolean a1[][]=new boolean[MAX][2];
	public static void insert(int a[],int n)
	{
		 
		for(int i=0;i<n;i++)
		{
			if(a[i]>=0)a1[a[i]][0]=true;
			else
				a1[Math.abs(a[i])][1]=true;
		}
	}
	public static boolean search(int x)
	{
		if(x>=0)
		{
			if(a1[x][0]==true)return true;
			else return false;
		}
		else
		{
			int y=Math.abs(x);
			if(a1[y][1]==true)return true;
			else return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = {-1, 9, -5, -8, -5, -2}; 
		 insert(a,a.length);
		 if(search(-1))System.out.println("Present");
		 if(search(9))System.out.println("Present");
		 
		 if(search(5))System.out.println("Present");
		 else System.out.println("Not Present");
	}

}
