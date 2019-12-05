import java.util.*;
class P1
{
	public static void main(String args[])
	{
		int array[]=new int[]{1,2,3,4,5,6,7,8,9,10};;
		int sum=0;
		double average;
		for(int i=0;i<10;i++)
		{
			sum=sum+array[i];
		}
		average=sum/10;
		System.out.println("The sum of array elements is:"+sum);
		System.out.println("The average of array elements is:"+average);
	}
}	