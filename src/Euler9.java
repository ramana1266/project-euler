//finding the only pythagorean triple satisfying a+b+c = 1000
/*    a=r*r - s*s; b= 2*r*s ; c= r*r + s*s 
 *    here, r>s ; r and s are co-primes ; one is odd and one is even 
 * 
*/
public class Euler9 {
	
	public static void main(String[] args)
	{	
		Long tym= System.currentTimeMillis();
		for(int i=30;i>=1;i--)
		{
			for(int j=10;j>=1;j--)
			{
				if((i*i-j*j) + (2*i*j) + (i*i+j*j) == 1000)
				{
					System.out.println(i*i-j*j);
					System.out.println(2*i*j);
					System.out.println(i*i+j*j);
					System.out.println((i*i-j*j) * (2*i*j) * (i*i+j*j));
					System.out.println(System.currentTimeMillis()-tym);
					break;
					
				}
			}
		}
	}

}
