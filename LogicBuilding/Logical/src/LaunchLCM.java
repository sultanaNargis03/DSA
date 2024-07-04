//brute force approach
public class LaunchLCM {

	public static int FindLCM(int a,int b)
	{
		int res=a>b?a:b;
		while(true)
		{
			if(res%a==0&&res%b==0)
			{
				break;
			}
				res++;
		}
		return res;
		
	}
	public static void main(String[] args) {
		int a=3;
		int b=5;
		System.out.println("LCM is= "+FindLCM(a,b));

	}

}
