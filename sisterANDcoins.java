
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        int gila_coin=sc.nextInt();
	        int mila_money=sc.nextInt();
	        int a[]=new int[gila_coin];
	        int sum=0;
	        for(int j=0;j<gila_coin;j++)
	        {
	            a[j]=sc.nextInt();
	            sum=sum+a[j];
	        }
	        giveutil(gila_coin,mila_money,a,sum);
	    }
	}
	
	public static void giveutil(int g_coin,int m_money,int a[],int sum)
	{   
	    if((sum+m_money)%2!=0)
	        {
	            System.out.println(0);
	            return;
	        }
	    sum=(sum+m_money)/2;
	    int amount = sum-m_money;
	    
	    if(give(amount,a,a.length))
	    System.out.println(1);
	    else
	    System.out.println(0);
	    
	}
	
	public static boolean give(int amount,int a[],int len)
	{
	    if (amount == 0) 
            return true; 
        if (len == 0 && amount != 0) 
            return false; 
       
        if (a[len-1] > amount) 
            return give(amount,a,len-1); 
          
       
        return give(amount,a,len-1) ||  give(amount-a[len-1],a,len-1); 
	   
	}
}