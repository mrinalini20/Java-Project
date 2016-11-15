import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOfNumbers {

	public static void main(String[] args) 
	{
		
		
		ArrayList<Integer> group1=new ArrayList<>();
		ArrayList<Integer> group2=new ArrayList<>();
		ArrayList<Integer> group3=new ArrayList<>();
		ArrayList<Integer> group4=new ArrayList<>();
		 
		int n;
		System.out.println("Enter the number of elements");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the numbers:");
			Scanner r=new Scanner(System.in);
			a[i]=r.nextInt();
		
		
		for(int k=0;k<n;k++)
		{
			if(a[k]>=0)
			{
				if(a[k]%2==0)
			{
			group1.add(a[k]);
			//System.out.println("Non-negative Even numbers:"); 
			
				
			}
		else
		{   group2.add(a[k]);
			//System.out.println("Negative Even numbers:");
			
		}
	}
}
  for (int m=0;m<n;m++)	
  {
	  if(a[m]>0)
	  {
		  if(a[m]%2!=0)
		  {   group3.add(a[m]);
			  //System.out.println("Non-negative Odd numbers:");
			  
		  }
	  }
	  else
	  {   group4.add(a[m]);
		  //System.out.println("Negative Odd numbers:");
		  
		 
		  }
	  }
	}
}
}