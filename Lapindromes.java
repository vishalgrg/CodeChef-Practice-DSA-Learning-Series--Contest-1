/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc  = new Scanner(System.in);
		int tt = sc.nextInt();
		
		while(tt>0){
		    
		   String input = sc.next();
		   String s1,s2;
		   int n = input.length();
		   if(n%2==0){
		       s1 = input.substring(0,(n/2));
		       s2 = input.substring(n/2);
		   }else{
		        s1 = input.substring(0,(n/2));
		       s2 = input.substring((n/2 + 1));
		   }
		   
		   char[]chars1 = s1.toCharArray();
		   Arrays.sort(chars1);
		   char[] chars2 = s2.toCharArray();
		   Arrays.sort(chars2);
		   
		  	String newstr1 = new String(chars1);
			String newstr2 = new String(chars2);
			
			if(newstr1.equals(newstr2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		   
		    tt--;
		}
	}
	
 

}
