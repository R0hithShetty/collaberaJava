package basic;

import java.util.Scanner;

public class Array_scanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the value");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
			System.out.println("the element are:");
			for(int i=0;i<a.length;i++) 
			{
				System.out.println(a[i]);
			}
	
			
			
			}
			

}
