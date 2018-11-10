import java.lang.*;
import java.io.*;
class I_am_Stubborn
 {  public static void main (String[] args)
	 {Scanner sc=new Scanner(System.in);
	 int T=sc.nextInt();
	 for(int t=0;t<T;t++)
	    {
	    int n=sc.nextInt();
        int result=(int)(Math.floor(Math.log(n)/Math.log(2)));
        result=(int)(Math.pow(2,result));
        System.out.println(result);
	       
	       
	     }
	 
	 }
}