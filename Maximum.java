import java.util.*;
public class Maximum 
{
	public static void main(String[] args) {
	    int []a=new int[5];
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<a.length;i++)
	    {
	       a[i]=sc.nextInt();
	    }
	    int m=0;
	    for(int i=0;i<a.length;i++)
	        {
	           if(a[i]>m) 
	           {
	               m=a[i];
	           }
	            
	        }
	        System.out.println(m);
	}
}