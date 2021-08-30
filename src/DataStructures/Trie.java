package DataStructures;

import java.util.ArrayList;
public class Trie {
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
	
	public static int countwords(TrieNode root)
	{
		 int num=0;
		 if (root.isEndOfWord) 
	            num++; 
		 for (int i = 0; i < ALBHABET_SIZE; i++)     
	          if (root.children[i] != null ) 
	             num += countwords(root.children[i]); 
		return num;
	}
	static void print(TrieNode root,char str[],int x)
	{
		 if (root.isEndOfWord) 
	     {
			 String str4=new String(str);
			 str4=str4.substring(0, x);
			 System.out.println(str4);
	     }

		 int i;
		 for (i = 0; i < ALBHABET_SIZE; i++)
		 {
			 if (root.children[i] != null ) 	 
	         { 
	        	  str[x]=(char)(i+'a');
	        	  print(root.children[i],str,x+1);
	         }
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String keys[] = {"the", "a", "there", "answer", "any","by", "bye", "their"};
		//inserting keys
		root = new TrieNode();
		//Trie m=new Trie();
		for(int i=0;i<keys.length;i++)
		{
			insert(keys[i]);
		}
		if(search("the") == true) 
            System.out.println("Present"); 
        else System.out.println("Not Present"); 
		
		if(search("mayur") == true) 
            System.out.println("Present"); 
        else System.out.println("Not Present"); 
		
		char ch[]=new char[100];
		print(root,ch,0);
	}

}
