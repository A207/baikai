package day2;

import java.util.Scanner;

public class text2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][]=new int[20][5];
        for(int i=0;i<20;i++)
        	for(int j=0;j<5;j++)
        	{
        		a[i][j]=(int)new java.util.Random().nextInt(100);
        	}
        
        for(int i=0;i<20;i++)
        {
        	System.out.print("student"+(i+1));
        	for(int j=0;j<5;j++)
        	{
        		System.out.print("   "+a[i][j]);
        	}
        	System.out.println();
        }
        
        int b[]=new int[20];
        for(int i=0;i<20;i++)
        {
        	for(int j=0;j<5;j++)     	
        {
        	b[i]=b[i]+a[i][j];
        }
        	System.out.print("student  "+(i+1));
        	System.out.print("   "+b[i]);        	
        }
        System.out.println();
        
        for(int j=0;j<5;j++)
        { 
        	int averge[]=new int[5];
        	 for(int i=0;i<20;i++)
        	 {
        		 averge[j]=(averge[j]+a[i][j]);        
        	 }
        	 averge[j]=averge[j]/20;
        	 System.out.println(" averge "+(j+1));
        	 System.out.println("  "+averge[j]);
        }
}
}

