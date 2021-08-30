package Trie_problems;
import DataStructures.Trie.TrieNode;

public class AllWords_Found_Dictionary_trie {
static final int ALBHABET_SIZE=26;
	
	public static class TrieNode
	{
		TrieNode children[]=new TrieNode[ALBHABET_SIZE];
		boolean isEndOfWord;
		public  TrieNode()
		{
			isEndOfWord=false;
			for(int i=0;i<ALBHABET_SIZE;i++)
			{
				children[i]=null;
			}
		}
		
	}
	
	static TrieNode root;
	//root = new TrieNode();
	public static void insert(String key)
	{
		int level;
		int length=key.length();
		int index;
		TrieNode pCrawl=root;
		for(level=0;level<length;level++)
		{
			index=key.charAt(level)-'a';
			
			if(pCrawl.children[index]==null)
			{
				pCrawl.children[index]=new TrieNode();
			}
			pCrawl=pCrawl.children[index];
		}
		pCrawl.isEndOfWord=true;
	}
	
	public static boolean search(String key)
	{
		int level;
		int length=key.length();
		int index;
		TrieNode pCrawl=root;
		for(level=0;level<length;level++)
		{
			index=key.charAt(level)-'a';
			
			if(pCrawl.children[index]==null)
			{
				return false;
			}
			pCrawl=pCrawl.children[index];
		}
		return (pCrawl!=null && pCrawl.isEndOfWord);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dict[] = {"find", "a", "geeks", "all", "for", "on", "geeks", "answers", "inter"};
		root=new TrieNode();
		for(int i=0;i<dict.length;i++)insert(dict[i]);
		String str[] = {"find", "all", "answers", "on", "all", "for", "geeks"};
		int num=0;
		for(int i=0;i<str.length;i++)
		{
			if(search(str[i])==true)num++;
			else
			{
				break;
			}
		}
		if(num==str.length)System.out.println("Yes");
		else System.out.println("No");
		char a=(char)5+'a';
		String str1=new String();
		str1=str1+a;
		System.out.println(str1);
	}

}
