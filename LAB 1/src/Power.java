import java.io.*;
import java.util.*;
public class Power 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int num=sc.nextInt();
	System.out.println(isPowerOfTwo(num));
	}

	static boolean isPowerOfTwo(int n)
	{
		boolean t=false;
		int rem=0;
		rem=n%2;
		if(n!=1 && n!=0)
		{
			n=n/2;
			if(rem==0)
			{
				t=true;
			}
			else
			{
				t=false;
			}
		}
		return t;
	}
}