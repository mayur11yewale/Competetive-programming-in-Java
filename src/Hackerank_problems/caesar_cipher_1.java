package Hackerank_problems;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/caesar-cipher-1/copy-from/109399841
public class Solution {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        String str=new String();
        char ch;
        for(int i=0;i<s.length();i++)
        { 
            ch=s.charAt(i);
            char ch1=0;
            //ch1=(char)((k%26)-('z'-s.charAt(i))+'a'-1);
            if(ch>='a' && ch<='z')
            {
                ch1=(char)(ch+k);
                if(ch1>'z' && (k%26)-('z'-s.charAt(i))>0)
                    {
                        ch1=(char)((k%26)-('z'-s.charAt(i))+'a'-1);
                        str=str+ch1;
                    }
                else if((k%26)-('z'-s.charAt(i))<=0)
                {
                        ch1=(char)((k%26)+s.charAt(i));
                        str=str+ch1;
                }
                else str=str+ch1;
            }
            else if((ch>='A' && ch<='Z'))
            {
                ch1=(char)(ch+k);
               if(ch1>'Z' && (k%26)-('Z'-s.charAt(i))>0)
                    {
                        ch1=(char)((k%26)-('Z'-s.charAt(i))+'A'-1);
                        str=str+ch1;
                    }
                else if((k%26)-('Z'-s.charAt(i))<=0)
                {
                        ch1=(char)((k%26)+s.charAt(i));
                        str=str+ch1;
                }
                else str=str+ch1;
            }
            else
            {
                str=str+ch;
            }
        }
        return str;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
