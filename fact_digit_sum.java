import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0){
	    int[] a={1,2,6,24,120,720,5040,40320,362880};
	    int[] b={1,2,3,4,5,6,7,8,9};
	    long n=s.nextLong();
	    ArrayList<Integer> al=new ArrayList<Integer>();
	    int temp=8;
	    while(n>0){
	        while(a[temp]<=n){
	            n=n-a[temp];
	            al.add(b[temp]);
	        }
	        temp--;
	    }
	    Collections.sort(al);
	    for(int i:al) System.out.print(i);
	    System.out.println();
	 }
}
}