import java.util.*;
class P9
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = s.nextInt();
		int i,sum,sum1,j,k;
		j = 0;
		k = 0;
		int array[] = new int[n];
		System.out.println("Enter array elements");
		for(i=0;i<n;i++)
		{
			array[i] = s.nextInt();
		}
		sum = 0;
		sum1 = 0;
		for(i=0;i<n;i++)
		{
			sum = sum + array[i];
		}
		for(i=0;i<n;i++)
		{
			if(array[i] == 6)
				j = i;
			if(array[i] == 7)
				k = i;
		}
		if(k < j)
			System.out.println("Sum is :"+sum);
		else
		{
			for(i=0;i<n;i++)
			{
				if(i >= j && i <= k)
					sum1 = sum1 + array[i];
			}
			sum = sum - sum1;
			System.out.println("Sum is :"+sum);
		}
	}
}