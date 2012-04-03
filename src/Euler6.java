//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.



public class Euler6 {
	public static void main(String[] args )
	{
		long n =100;
		System.out.println(n*(n+1)*((2*n)+1)/6 - n*n*(n+1)*(n+1)/4);
	}

}
