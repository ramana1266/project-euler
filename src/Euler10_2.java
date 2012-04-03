// sum of all prime numbers < 2million. partially using  sieve algorithm. very fast. Euler10_3 is the fastest 


public class Euler10_2 {
	
	public static void main(String[] args)
	{
		Long tym= System.currentTimeMillis();
		Boolean[] sieve = new Boolean[2000000];
		Long sum = (long) 2;
		for(int num=3;num<2000000;num+=2)
		{
			if(sieve[num]==null)
			{
			sum=sum+num;
			for(int j=2*num;j<2000000;j+=num)
			{
				sieve[j]=true;
			}
			}
		}
		System.out.println(sum);
		System.out.println(System.currentTimeMillis()-tym);
	}
	

}
