
public class LaunchPrimeNumber 
{

	public static boolean checkPrime(int n)
	{
		if(n==1)
			return false;
		if(n==2||n==3)
			return true;
		if(n%2==0||n%3==0)
			return false;
		for(int i=5;i*i<=n;i=i+6)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		int n=11;
		
		System.out.println(checkPrime(n));
		
	}

}
