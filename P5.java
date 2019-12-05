import java.util.*;
class P5
{
	public static void main(String args[])
	{
		int array[] = new int[]{251,494,65,316,252,243,507,1240,554};
		int n = array.length;
		int i;
		int max1 = array[0];
		int max2 = array[0];
		int min1 = array[0];
		int min2 = array[0];
		for(i=0;i<n;i++)
		{
			if(array[i]>max1)
				max1 = array[i];
			if(array[i]<min1)
				min1 = array[i];
		}
		System.out.println("The First maximum number :"+max1);
		System.out.println("The First minimum number :"+min1);
		for(i=0;i<n;i++)
		{
			if(array[i] > max2 && array[i] != max1)
				max2 = array[i];
			if(array[i] < min2 && array[i] != min1)
				min2 = array[i];
		}
		System.out.println("The second maximum number :"+max2);
		System.out.println("The second minimum number :"+min2);
	}
}