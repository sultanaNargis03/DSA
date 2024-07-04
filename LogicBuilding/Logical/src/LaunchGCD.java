public class LaunchGCD {

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
		int b=13;
		System.out.println("GCD is= "+FindGcd(a,b));
	}

}
