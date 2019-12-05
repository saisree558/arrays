class P7
{
	public static void main(String args[])
	{
		int array[] = new int[]{1,2,3,1,2,3,4,5,6,7,1,2};
		int n=array.length;
		int i,k,j,max,c;
		max = array[0];
		c = 0;
		k = 0;
		for(i=0;i<n;i++)
		{
			if(array[i] > max)
				max = array[i];
		}
		int array1[] = new int[max+1];
		for(i=0;i<n;i++)
		{
			j = array[i];
			array1[j] = array1[j]+1;
		}
		for(i=0;i<max;i++)
		{
			if(array1[i] != 0)
			{
				c++;
			}
		}
		int array2[] = new int[c];
		for(i=0;i<max;i++)
		{
			if(array1[i] != 0)
			{
				array2[k] = i;
				k++;
			}
		}
		for(i=0;i<c;i++)
		{
			System.out.println(array2[i]);
		}
	}
}
				
			