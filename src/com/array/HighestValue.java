package com.array;

public class HighestValue {
public static void main(String[] args) {
	int a[]= {1,4,6,2,3,5};
	
	int temp;
	
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=i+1;j<a.length-1;j++) 
		{
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;		
			}	
		}
	}
	System.out.println("Second highest number is  "+a[a.length-1]);
	                                                  
}
}
