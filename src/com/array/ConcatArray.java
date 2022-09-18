package com.array;
import java.util.Arrays;

public class ConcatArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		int c[]= new int[a.length+b.length];
		int i;
		int j=0;
		for(i=0;i<a.length;i++)
		{
			c[j]=a[i];
			j++;
		}
		for(i=0;i<b.length;i++) 
		{
			c[j]=b[i];
			j++;
		}
		
			System.out.print(Arrays.toString(c));
		
	}
	
}
