// sum of all prime numbers < 2million. very very slow. Euler10_2 is a bit faster and Euler10_3 is the fastest


public class Euler10 {
	static Long sum=(long) 2;
	
	public static int isprime(Long num)
	{
		for(int i=2;i<=Math.pow(num, 0.5);i++)
		{
			if(num%i == 0)
			{
				return 0;
			}
		}
		sum = sum + num;
		return 0;
	}
	public static void main(String[] args)
	{
		Long tym= System.currentTimeMillis();
		for(Long num=(long) 3;num<2000000;num+=2)
		{
			isprime(num);
		}
		System.out.println(sum);
		System.out.println(System.currentTimeMillis()-tym);
	}
	

}
