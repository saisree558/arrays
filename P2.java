import java.util.*;
class P2
{
	public static void main(String args[])
	{
		int array[] = new int[]{1,2,3,4,5,6,7,8,9,10};
		int min = array[0];
		int max = array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
				max = array[i];
			if(array[i]<min)
				min = array[i];
		}
		System.out.println("The Minimum value in array is:"+min);
		System.out.println("The Maximum value in array is:"+max);
	}
}