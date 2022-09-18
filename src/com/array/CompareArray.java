package com.array;

public class CompareArray 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6};
		int b[]= {1,2,3,4,5,6};
		int c[]= {3,21,3,44,5,6,8};
		int d[]= {8,7,99,1,2,6};
		
		System.out.println("\n\n **** a and b capare **** ");
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++) 
			{
				for(int j=0;j<b.length;j++) 
				{
					if(a==b) 
					{
						System.out.println("a and b is equal");
					}
					else 
					{
						System.out.println("a and b are not equal");
					}
				}
				
			}
		}
		else {
			System.out.println("a and b are not equal");
		}
		
		
	}
}
