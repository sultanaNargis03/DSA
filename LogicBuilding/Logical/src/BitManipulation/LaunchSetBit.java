package BitManipulation;

public class LaunchSetBit 
{
	public static int countSetBit(int n)
	{
		int count=0;
		
		while(n>0)
		{
			n=n&(n-1);
			count++;
		}
		return count;
			
	}
	
	public static void main(String[] args) 
	{
		int n=42;
		int count=countSetBit(n);
		System.out.println("Total set bit of "+n+" is "+count);
		

	}

}
