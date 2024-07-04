import java.util.Scanner;

public class LaunchSorting {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the number of element you want to store in the array");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		
		System.out.println("Please enter the element you want to store in the array");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		System.out.println("Array before sort:");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		BubbleSort bs=new BubbleSort();
		bs.bubbleSorting(ar);
		
		System.out.println("\nSorted Array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}		

	}

}
