package Trie_problems;
import DataStructures.Trie.TrieNode;

public class Prfefix_Match_given_String_E{
static final int ALBHABET_SIZE=26;
	
	public static class TrieNode
	{
		TrieNode children[]=new TrieNode[ALBHABET_SIZE];
		boolean isEndOfWord;
		int freq;
		public  TrieNode()
		{
			isEndOfWord=false;
			freq=0;
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
			pCrawl.freq++;
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
	
	public static int frequency(String str)
	{
		 	int level;
			int length=str.length();
			int index;
			TrieNode pCrawl=root;
			for(level=0;level<length;level++)
			{
				index=str.charAt(level)-'a';
				
				if(pCrawl.children[index]!=null)
				pCrawl=pCrawl.children[index];
				else return 0;
			}
			/*for(int i=0;i<ALBHABET_SIZE;i++)
			{
				if(pCrawl.children[i]!=null)num++;
			}*/
			/*int num1=0;
			num1=countwords(pCrawl);
			return num1;*/
			return pCrawl.freq;
	}
/*	public static int countwords(TrieNode root)
	{
		 int num=0;
		 if (root.isEndOfWord) 
	            num++; 
		 for (int i = 0; i < ALBHABET_SIZE; i++)     
	          if (root.children[i] != null ) 
	             num += countwords(root.children[i]); 
		return num;
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"abba", "abbb", "abbc", "abbd", "abaa", "abca","hack","hackerank"};
		String str = "abb";
		int k = 3;
		int count=0;

		String str1 = str.substring(0, k);
		root=new TrieNode();
		for(int i=0;i<arr.length;i++)
		{
			insert(arr[i]);
		}
		/*if(search("abba")==true)System.out.println("Yes");
		else System.out.println("No");*/
		System.out.println(frequency(str1));
	}

}
