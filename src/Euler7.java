// find the 10001st prime number. For better computation time, see http://primes.utm.edu/nthprime/algorithm.php

import java.util.ArrayList;
public class Euler7 {
	Long tym;
	ArrayList<Long> a=new ArrayList<Long>();
	Euler7()
	{
		tym= System.currentTimeMillis();
		a.add((long) 2);
	}
	public int nthprime(long num)
	{
		for(int i=2;i<Math.pow(num, 0.5);i++)
		{
			if(num%i ==0)
			{
				return 0;	
			}
		}
		a.add(num);
		//System.out.println(a.get(a.size()-1));
		
				return 0;
	}
	public void wantedn()
	{
		for(Long i=(long) 3;;i+=2)
		{
		this.nthprime(i);
		if(a.size()==10001)
		{
			System.out.println(a.get(a.size()-1));
			System.out.println(System.currentTimeMillis()-this.tym);
			System.exit(0);
												
		}
	    }
				
	}
	public static void main(String[] args)
	{
		
		Euler7 e7 = new Euler7();
		e7.wantedn();
	}

}
