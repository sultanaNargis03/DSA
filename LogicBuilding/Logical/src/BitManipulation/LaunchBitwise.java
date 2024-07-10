package BitManipulation;

public class LaunchBitwise {

	public static void rightShift(int n)
	{
		int i=3;
		int onMask=1<<i;
		System.out.println(n|onMask);
		
	}
	public static void main(String[] args) {
	
//		int n=-5;
//		System.out.println(n>>1);
		
		int n=36; //bin=>00100100
		rightShift(n);

	}

}
