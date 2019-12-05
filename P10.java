class P10
{
	public static void main(String args[])
	{
		int n = args.length;
		int i,j,k,m;
		int [] arr = new int [n];
      		for(i=0; i<n; i++) 
		{
         		arr[i] = Integer.parseInt(args[i]);
      		}
		m = n;
		int [] arr2 = new int [n];
		for(i=0;i<n;i++)
		{
			arr2[m-1] = arr[i];
			m = m- 1;
		}
		if(n < 4 || n > 4)
		{
			System.out.println("Please enter 4 integers");
		}
		else
		{
			int arr1[][] = new int[2][2];
			k = 0;
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					arr1[i][j] = arr2[k];
					k++;
				}
			}
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					System.out.print(arr1[i][j]+"  ");
				}
				System.out.println();
			}
		}
	}
}