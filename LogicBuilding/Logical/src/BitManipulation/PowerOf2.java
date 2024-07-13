package BitManipulation;

public class PowerOf2 
{

	public static void checkPowerOf2(int n)
	{
		boolean result=true;
		if(n==0)
		{
			result=false;
		}
		else
		{
			if((n&(n-1))==0)
			{
				result=true;
			}
			else
			{
				result =false;
			}
		}
		System.out.println(result);
	}
	public static void main(String[] args) 
	{
		int n=32;
		checkPowerOf2(n);
		
	}

}
