import java.util.*;
public class Main
{
    static boolean prime(int n)
    {
        boolean c=true;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                c=false;
                return c;
            }
        }
        return c;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	        boolean v=prime(i);
	        int s=0;
	        if(v==true)
	        {
	            int t=i;
	            int k=i;
	            while(k>0)
	            {
	                int r=k%10;
	                s=s*10+r;
	                k/=10;
	            }
	            if(s==t)
	            {
	                System.out.print(s+" ");
	            }
	        }
	    }
	}
}