import java.util.ArrayList;
public class Euler2 {
  
	static ArrayList<Long> fiblist = new ArrayList<Long>();
	private static int sum;
	
	public static void fibon()
	{	int n =1;
		sum = 0;
		while(fiblist.get(n)<=4000000)
		{
		fiblist.add(fiblist.get(n) + fiblist.get(n-1));
		n=n+1;
		if(fiblist.get(n)%2==0)
		{
			sum+=fiblist.get(n);
		}
		}
		
		System.out.println(sum);
		
	}
	public static void main(String args[])
	{
		fiblist.add(new Long(0));
		fiblist.add(new Long(1));
		Euler2.fibon();
	}
}