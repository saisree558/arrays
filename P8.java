class P8
{  
	public static void main(String[] args) 
	{    
        	int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1}; 
        	int [] fr = new int [arr.length];  
        	int visited = -1; 
		int max,k;
        	for(int i = 0; i < arr.length; i++)
		{  
            		int count = 1;  
            		for(int j = i+1; j < arr.length; j++)
			{  
                		if(arr[i] == arr[j])
				{  
                    			count++;   
                    			fr[j] = visited;  
                		}  
            		}  
            		if(fr[i] != visited)  
                		fr[i] = count;  
        	}
		max = fr[0];
		for(int i = 0; i < fr.length; i++)
		{
			if(fr[i] > max)
			{
				k = i;
				max = fr[i];
			}
		}      
        	for(int i = 0; i < fr.length; i++)
		{  
            		if(fr[i] != visited && fr[i] == max)  
                		System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        	}
		System.out.println("Highest Frequency :"+max); 
        }  
}  