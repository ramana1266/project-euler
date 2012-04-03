// sum of all prime numbers < 2million. completely using  sieve algorithm. very very fastest. 


public class Euler10_3 {
	
	public static void main(String[] args)
	{
		Long tym= System.currentTimeMillis();
		Boolean[] sieve = new Boolean[2000000];
		for(int num=3;num<2000000;num+=2)
		{
			if(sieve[num]==null)
			{
				if(num>Math.pow(2000000, 0.5))
				{
					Long sum=(long) 2;
					for(int i=3;i<2000000;i+=2)
					{
						if(sieve[i]==null)
						{
							sum=sum+i;
						}
					}
					System.out.println(sum);
					System.out.println(System.currentTimeMillis()-tym);
					break;
				}
			for(int j=2*num;j<2000000;j+=num)
			{
				sieve[j]=true;
			}
			}
		}
		
	}
	

}
