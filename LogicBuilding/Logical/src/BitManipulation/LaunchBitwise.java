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
	public static int toggle(int n)
	{
		int i=5;
		int tMask=1<<i;
		return (n^tMask);
		
	}
	public static void checkOnorOff(int n)
	{
		int i=5;
		int mask=1<<i;
		if((n&mask)==0)
			System.out.println("OFF");
		else
			System.out.println("ON");
		
		
		
	}
	public static String d2b(int  n)
	{
		String res="";
		int index=0;
		while(index<8)
		{
			int rem=n%2;
			res=rem+res;
			n=n/2;
			index++;
		}
		return res;
	}
	public static void main(String[] args) {
	
//		int n=-5;
//		System.out.println(n>>1);
		
		int n=36; //bin=>00100100
		
		System.out.println("number in binary  "+n+"->"+d2b(n));
		
		
		int on=switchOn(n);
		int off=switchOff(n);
		int tog=toggle(n);
		
		String binOn=d2b(on);
		String binOff=d2b(off);
		
		System.out.println("switch on ith bit "+on+"->"+ binOn);
		System.out.println("switch off ith bit "+off+"->"+binOff );
		System.out.println("toggle the ith bit "+tog+"->"+d2b(tog));
		
		checkOnorOff(n);
		

	}

}
