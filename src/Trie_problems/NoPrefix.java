package Trie_problems;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.ArrayList;
public class NoPrefix {

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
            int num1=0;
            /*for(int i=0;i<ALBHABET_SIZE;i++)
            {
                if(pCrawl.children[i]!=null)num1++;
            }*/
            
            num1=pCrawl.freq;
            return num1;
    }

    static void contacts(String[] queries,int x) {
        /*
         * Write your code here.
         */
            root=new TrieNode();
            String str=new String();
            int index;
            for(int i=0;i<x;i++)
            {
                insert(queries[i]);
            }
            for(int i=0;i<x;i++)
            {
                str=queries[i];
                for(int j=0;j<str.length();j++)
                {
                    index=str.charAt(j)-'a';
                    if(root.children[index]!=null)
                    {
                        root=root.children[index];
                    }
                }
                print(root);
               
        }
    }
    static void print(TrieNode node)
    {
    	 for(int k=0;k<26;k++)
         {
             if((root.children[k]!=null) && root.isEndOfWord)
             {
                 System.out.println("Bad set");
                 break;
             }
         }
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int queriesRows = Integer.parseInt(scanner.nextLine().trim());

        String[] queries = new String[queriesRows];

        for (int queriesRowItr = 0; queriesRowItr < queriesRows; queriesRowItr++)
            queries[queriesRowItr] = scanner.nextLine();

           

        contacts(queries,queriesRows);

        /*for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();*/

       // bufferedWriter.close();
    }
}