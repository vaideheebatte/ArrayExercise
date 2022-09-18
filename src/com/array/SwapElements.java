package com.array;

public class SwapElements {
public static void main(String[] args) {
	int temp=0;
	int a[]= {1,2,3,5,7};
	System.out.println("a[0] is "+a[0]);
	System.out.println("a[4] is "+a[4]);
	temp = a[0];
	a[0]=a[4];
	a[4]=temp;
	System.out.println("a[0] is "+a[0]);
	System.out.println("a[4] is "+a[4]);
	System.out.println("Array is");
	for(int i=0;i<a.length;i++) {
		
		System.out.print("\t"+a[i]);
	}
	
}
}
