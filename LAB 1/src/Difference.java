import java.io.*;
import java.util.*;

public class Difference
{	  
	static int calculateDifference(int n)
	{   
	int l, k, m; 
	    /* Sum of the squares of the first n natural numbers.*/
	    l = (n * (n + 1) * (2 * n + 1)) / 6; 
	    /* Sum of n naturals numbers. */
	    k = (n * (n + 1)) / 2; 
	    k = k * k; 
	    m =Math.abs(l - k);  
	    return m; 
	} 
	public static void main(String[] args) 
	{ 
	    int n = 0; 
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the value of n");
	    n=sc.nextInt();
	    System.out.println(calculateDifference(n));      
	      
	} 
}  