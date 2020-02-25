import java.io.*;
import java.util.*;

public class Sum
{
	static int calculateSum(int n)  
	{  
	    int sum=0,S1=0,S2=0,S3=0;  
	  
	    S1 = ((n / 3)) * (2 * 3 + (n/ 3 - 1) * 3) / 2;  
	    S2 = ((n / 5)) * (2 * 5 + (n/ 5 - 1) * 5) / 2;  
	    S3 = ((n / 15)) * (2 * 15 + (n/ 15 - 1) * 15) / 2;  
	  
	    sum=S1 + S2 + S3;  
	    return sum;
	}   
	 public static void main (String[] args) 
	 { 
	    int n=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the value of n: ");
	    n=sc.nextInt();
	    System.out.print(calculateSum(n));  
	} 	  
}  