package com.array;
import java.util.Arrays;

public class RemoveDublicate {
	public static void main(String[] args) {
		int a[]= {1,3,2,6,4,8,2};
		int b[]=new int[a.length];
		int k=0;
		int i,temp;
		
		for( i=0;i<a.length-1;i++)
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
		for( i=0;i<a.length-1;i++) 
		{
			if(a[i]!=a[i+1])
			{
				a[k]=a[i];
				k++;
			}
		}
		
		b[k]=a[a.length-1];
		System.out.println("\n After removing dublicate element array is : ");
		for(i=0;i<k;i++) {
			System.out.print("\t "+a[i]);
		}
		
		
	}
	
}
