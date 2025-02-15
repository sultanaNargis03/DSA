import java.util.Scanner;

public class TrailingZeroFactorial 
{
	public static long Factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
				
	}
	public static int TrailingZero(int n)
	{
		int res=0;
		int power=5;
		while(power<=n)
		{
			res=res+(n/power);
			power=power*5;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to count the trailing zero from its factorial");
		int n=sc.nextInt();
		System.out.println("Factorial of "+n+" is: "+Factorial(n));
		System.out.println("Trailing zero of factorial "+n+" is: "+TrailingZero(n));
	}

}
