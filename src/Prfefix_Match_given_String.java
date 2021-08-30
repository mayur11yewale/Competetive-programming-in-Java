
public class Prfefix_Match_given_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"abba", "abbb", "abbc", "abbd", "abaa", "abca"};
		String str = "abbg";
		int k = 3;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(str.substring(0, k).equals(arr[i].substring(0, k)))
			{
				count++;
			}
		}
		System.out.println(count);
		//System.out.println('n'-'a');
	}

}
