import java.util.Scanner;

public class LaunchMain 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		FindElement obj=new FindElement();
		System.out.println("Enter how many elements you want to store in the array");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

		int secondLargestElement=obj.findSecondLargestElement(arr);
		System.out.println("Second Largest Element is: "+secondLargestElement);
	}

}
