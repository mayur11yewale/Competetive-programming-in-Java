package Hashing;

public class DoubleHashing {
	static int TABLE_SIZE=13;
	static int PRIME=7;
	static int curr_size;
	static int[] hashTable=new int[TABLE_SIZE];
	DoubleHashing()
	{
		curr_size=0;
		for(int i=0;i<TABLE_SIZE;i++)
		{
			hashTable[i]=-1;
		}
	}
	static boolean isFull()
	{
		return (curr_size == TABLE_SIZE);
	}
	static int hash1(int key)
	{
		return (key%TABLE_SIZE);
	}
	static int hash2(int key)
	{
		return (PRIME-(key%PRIME));
	}
	static void insertHash(int key)
	{
		// if hash table is full 
        if (isFull()) 
            return; 
  
        // get index from first hash 
        int index = hash1(key); 
  
        // if collision occurs 
        if (hashTable[index] != -1) 
        { 
            // get index2 from second hash 
            int index2 = hash2(key); 
            int i = 1; 
            while (true) 
            { 
                // get newIndex 
                int newIndex = (index + i*index2)%TABLE_SIZE; 
  
                // if no collision occurs, store 
                // the key 
                if (hashTable[newIndex] == -1) 
                { 
                    hashTable[newIndex] = key; 
                    break; 
                } 
                i++; 
            	} 
        }
  
        // if no collision occurs 
        else
            hashTable[index] = key; 
        curr_size++; 
	}
	static void displayHash() 
    { 
        for (int i = 0; i < TABLE_SIZE; i++) 
        { 
            if (hashTable[i] != -1) 
               System.out.println(hashTable[i]) ;
            else
            	System.out.println(i); 
        } 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {19, 27, 36, 10, 64}; 
		DoubleHashing d=new DoubleHashing();
		for (int i=0; i<a.length;i++)d.insertHash(a[i]); 
		d.displayHash();
		
	}

}
