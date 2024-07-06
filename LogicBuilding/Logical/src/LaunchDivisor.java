
public class LaunchDivisor {

	public static void printDivisor(int n)
	{	
		int i;
		for(i=1;i*i<=n;i++)
		{
			if(n%i==0)
				System.out.println(i);
		}
		for(;i*i>=1;i--)
		{
			if(i!=n/i)
			{
				if(n%i==0)
					System.out.println(n/i);
			}
		}
		
	}
	public static void main(String[] args) 
	{
		int n=40;
		printDivisor(n);

	}

}
