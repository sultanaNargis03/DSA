
public class FindElement 
{
	int findSecondLargestElement(int ar[]) 
	{
		
		int max1=0;
		int max2=0;
		
		if(ar[0]>ar[1])
		{
			max1=ar[0];
			max2=ar[1];
		}	
		else
		{
			max2=ar[0];
			max1=ar[1];
		}
		for(int i=2;i<ar.length;i++)
		{
			if(ar[i]>max1)
			{
				max2=max1;
				max1=ar[i];
				
			}
			else if(ar[i]>max2)
			{
				max2=ar[i];
			}
		}
		return max2;
	}
}
