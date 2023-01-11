/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0)
		{
		    int N = sc.nextInt(); // TAKE A INPUT N
		    int num = 0;
		    int[] A = new int[N]; //TAKE A ARRAY INPUT
		    
		    for(int i = 0; i<N; i++)
		    {
		        A[i] = sc.nextInt();
		        num ^= A[i];
		    }
		    if(N % 2 == 0)
		    {
		        if(num != 0)
		        {
		            System.out.println("NO");
		        }
		        else{
		            System.out.println("YES");
		        }
		    }
		    else{
		        System.out.println("YES");
		    }
		}
	}
}
