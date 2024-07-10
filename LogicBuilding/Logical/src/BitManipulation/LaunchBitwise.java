package BitManipulation;

public class LaunchBitwise {

	public static int switchOn(int n)
	{
		int i=3;
		int onMask=1<<i;
		return (n|onMask);
		
	}
	public static int switchOff(int n)
	{
		int i=5;
		int offMask=~(1<<i);
		return (n&offMask);
		
	}
	public static String d2b(int  n)
	{
		String res="";
		while(n>0)
		{
			int rem=n%2;
			res=rem+res;
			n=n/2;
		}
		return res;
	}
	public static void main(String[] args) {
	
//		int n=-5;
//		System.out.println(n>>1);
		
		int n=36; //bin=>00100100
		
		System.out.println(d2b(n));
		
		int on=switchOn(n);
		int off=switchOff(n);
		
		String binOn=d2b(on);
		String binOff=d2b(off);
		System.out.println("switch on ith bit "+on+"->"+ binOn);
		System.out.println("switch off ith bit "+off+"->"+binOff );

	}

}
