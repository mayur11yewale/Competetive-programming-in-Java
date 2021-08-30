package String;

public class Morgan_String {
	public static void main(String[] args) {
		String a="ERFGHJKMLFTYFYGYGUHKHUHUHHHUHHIHIHHIHIHIHIHIHIHIIBBNNKMLMMNBCFXDXZDXFCGVHJ";
		String b="OHFWFOJFXXFGHJHIKHBVGGHGHKHHKGGFDGGJKLJGHFDRSRFKJL";
		String str=new String();
        int i=0,j=0;
        while(i<a.length() && j<b.length())
        {
            if(a.charAt(i)==b.charAt(j))
            {
                str=str+a.charAt(i);
                i++;
            }
            else if(a.charAt(i)<b.charAt(j))
            {
                str=str+a.charAt(i);
                i++;
            }
            else
            {
                str=str+b.charAt(j);
                j++;
            }
        }
        if(i<a.length())str=str+a.substring(i,a.length());
        if(j<b.length())str=str+b.substring(j,b.length());
        System.out.println(str);
	}
}
