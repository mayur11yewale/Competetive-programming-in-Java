package Trie_problems;

import Trie_problems.Print_Words_Albhabeticcaly_trie.TrieNode;

public class Trie_Autocomplete{
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
	
	static void print(TrieNode root,char str[],int x,String str5)
	{
		TrieNode pCrawl=root;

		if (root.isEndOfWord) 
	     {
			 String str4=new String(str);
			 str4=str4.substring(0, x);
			 System.out.println(str5+str4);
	     }
		
		int i;
		for (i = 0; i < ALBHABET_SIZE; i++)
		{
			if (pCrawl.children[i] != null) 	 
	        { 
	        	 str[x]=(char)(i+'a');
	        	 print(pCrawl.children[i],str,x+1,str5);
	        }
		}
	}
	static public boolean traverse(String key,TrieNode root)
	{
		TrieNode pCrawl=root;
		int level;
		int length=key.length();
		int index=0;
		for(level=0;level<length;level++)
		{
			index=key.charAt(level)-'a';
			
			if(pCrawl.children[index]==null)
			{
				return true;
			}
			else pCrawl=pCrawl.children[index];
		}
		System.out.println(index);
		String str=key;
		char ch[]=new char[100];
		if(pCrawl==null)System.out.println("Dont call");
		else print(pCrawl,ch,0,str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"abba", "abbb", "abbc", "abbd", "abaa", "abca","hack","hackerank"};
		String str = "bh";
		int k = 3;
		int count=0;

		//String str1 = str.substring(0, k);
		root=new TrieNode();
		for(int i=0;i<arr.length;i++)
		{
			insert(arr[i]);
		}
		char ch[]=new char[100];
		
		traverse(str,root);
	}

}
