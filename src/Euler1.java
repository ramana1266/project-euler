// Add all the natural numbers below one thousand that are multiples of 3 or 5.

public class Euler1 {
	public static void sum()
	{
		int sum=0;
		int i=3;
		while(i<1000)
		{
			sum=sum+i;
			i=i+3;
		}
		int j=5;
		while(j<1000)
		{
			sum=sum+j;
			j=j+5;
		}
		int k=15;
		while(k<1000)
		{
			sum=sum-k;
		    k=k+15;

		}
		System.out.println(sum);
	}

	public static void main(String args[])
	{
	Euler1.sum();
	}
}

