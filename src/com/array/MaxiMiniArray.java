package com.array;

public class MaxiMiniArray {
	public static void main(String[] args) {
		int a[]= {7,3,8,2,4,9,1,6};
		int temp=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++) 
			{
				if(a[i]>a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			System.out.print("\t"+a[i]);
		}
		System.out.println("\n\t Minimum value is "+a[0]);
		System.out.println("\n\t Maximum value is "+a[7]);
	}
}


