import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    long[] arr = new long[76];
	    for(int i = 0; i<=6;i++)
	    {
	        arr[i] = i;
	    }
	    for(int i = 7 ;i<76;i++)
	    {
	        arr[i] = Math.max(arr[i-4]*3,arr[i-5]*4);
	    }
	    while(t-->0)
	    {
	        System.out.println(arr[in.nextInt()]);
	    }
	 }
}