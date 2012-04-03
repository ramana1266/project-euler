//java code to find the largest palindrome formed by the product of two 3 digit numbers.

import java.util.ArrayList;


public class Euler4 {
	
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
		Euler4 e4=new Euler4();
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=999;i>=100;i--)
		{
			int count = 999;
			for(int j=count;j>=100;j--)
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
			count--;
			
		}
		
		
	}
}
