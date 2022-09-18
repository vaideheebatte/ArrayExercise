package com.array;

public class DublicateElement {
	public static void main(String[] args) {
		
		int i;
		int a[]= {1,2,3,4,2,5};
		
		for( i=0;i<a.length-1;i++) 
		{
			
			for(int j=i+1;j<a.length;j++) 
			{
					if(a[i]==a[j] && i!=j) 
					{
						System.out.println("\n\t Dublicate number is  "+a[i]);
						//System.out.println(" i is "+i+" j is "+j);
					}	
			}
		}	
	}	
}
