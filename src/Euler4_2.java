//java code to find the largest palindrome formed by the product of two 3 digit numbers.

/* since it is a sum of 3 digit number, it should be a 6 digit number
	so the number is of the form 'abccba'
	100000a+10000b+1000c+100c+10b+a= 100001a+10010b+1100c =11(9091a + 910b + 100c) 
	i.e the resulting number should be divisible by 11. so, at least one of the two 3 digit numbers must be divisible by 11.
	so we have to compute with lesser numbers. The improved version of Euler4 is this.   */

import java.util.ArrayList;


public class Euler4_2 {
	
	public boolean palindrome(int Num)
	{
		boolean isPalindrome=true;
		int tmp=Num;
		int rev=0;
		while(tmp>0){
			rev=rev*10 + tmp%10;
			tmp=tmp/10;
		}
		if(rev==Num)
		return isPalindrome;
		else return !isPalindrome;
	}

	
	public static void main(String[] args){

		long tym= System.currentTimeMillis();
		Euler4_2 e4=new Euler4_2();
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=999;i>=100;i--)
		{
			//int count = 999;
			for(int j=990;j>=100;j-=11)
			{
		        int tmp=i*j;
				if(e4.palindrome(tmp)==true) {
					//System.out.println(tmp);
					a.add(tmp);
					if(a.size()>1)
					{
						if(a.get(a.size()-1)>a.get(a.size()-2)){
						System.out.println(a.get(a.size()-1));
						System.out.println(System.currentTimeMillis()-tym);
						return;
						}
						else
						{
							a.set((a.size()-1), a.get(a.size()-2));
						}
					}
					continue;
				}
			}
			//count--;
			
		}
		
		
	}
}

