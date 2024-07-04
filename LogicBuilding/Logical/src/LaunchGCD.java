public class LaunchGCD {

	public static int FindLCM2(int a,int b)
	{
		return (a*b)/FindGcd(a,b);
	}
	public static int FindGcd(int a,int b)
	{
		while(a!=0&&b!=0)
		{
			if(a>b)
			{
				a=(a%b);
			}
			else 
			{
				b=(b%a);
			}
			
		}
		if(a!=0)
			return a;
		else 
			return b;
	}
	public static void main(String[] args) 
	{
		int a=25;
		int b=15;
		System.out.println("GCD is= "+FindGcd(a,b));
		System.out.println("LCM is= "+FindLCM2(a,b));
	}

}
