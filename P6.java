import java.util.*;
class P6
{
	public static void main(String args[])
	{
		int array[] = new int[]{251,494,65,243,316,252,507,1240,554};
		int n = array.length;
		int i,j,temp;
		for(i = 0; i < n; i++) 
		{     
                	for (j = i+1; j < n; j++) 
			{     
               			if(array[i] > array[j]) 
				{    
                   			temp = array[i];    
                   			array[i] = array[j];    
                   			array[j] = temp;    
               			}     
            		}     
        	}
		for(i=0;i<n;i++)
			System.out.println(array[i]);
	}
}    
          