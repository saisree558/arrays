import java.util.*;
class P3
{
	public static void main(String args[])
	{
		int array[] = new int[]{1,2,3,4,5,6,7,8,9,10};
		int element,i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the element to be searched");
			element = s.nextInt();
		for(i=0;i<array.length;i++)
		{
			if(array[i]==element)
			{
				System.out.println("The element found at index:"+i);
				break;
			}
		}
		if(i>=array.length)
			System.out.println("-1");
	}
}