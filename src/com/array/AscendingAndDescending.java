package com.array;

public class AscendingAndDescending {
	 int a[]= {7,3,8,2,4,9,1,6};
		int temp=0;
 public void ascending() {
	 System.out.print ("\n Ascending Array is ");
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
 }
 public void descending() {
	 
	System.out.print ("\n Descending Array is ");
	 for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++) 
			{
				if(a[j]>a[i]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		
			System.out.print("\t"+a[i]);
		}
 }
 public static void main(String[] args) {
	 AscendingAndDescending a1= new AscendingAndDescending();
	 a1.ascending();
	 a1.descending();
}
}
