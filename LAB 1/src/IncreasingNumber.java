import java.io.*;
import java.util.*;
public class IncreasingNumber 
{	
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int n = scanner.nextInt();
	        System.out.println(checkNumber(n));
	    }
	    public static boolean checkNumber(int input)
	    {
	        if (input < 0)
	            input = -input;
	        int previous = 10; 
	        int current;
	        while (input > 0) {
	            current = input % 10;
	            if (previous < current)
	                return false;
	            previous = current;
	            input /= 10;
	        }
	        return true;
	    }
	}