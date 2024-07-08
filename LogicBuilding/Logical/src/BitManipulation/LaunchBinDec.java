package BitManipulation;

public class LaunchBinDec 
{
	public static String decimalToBinary(int n)
	{
		String bin="";
		while(n>0)
		{
			bin=(n%2)+bin;
			n=n/2;	
		}
		return bin;
	}
	public static int binaryToDecimal(String bin)
	{
		int pow=1;
		int res=0;
		for(int i=bin.length()-1;i>=0;i--)
		{
			if(bin.charAt(i)=='1')
			{
				res=res+pow;	
			}
			pow=pow*2;
		}
		return res;
		
	}

	public static void main(String[] args) 
	{
		int n=10;
		String bin=decimalToBinary(n);
		System.out.println(bin);
		int dec=binaryToDecimal(bin);
		System.out.println(dec);
		

	}

}
