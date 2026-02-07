package Looping;
import java.util.Scanner;
public class program3 {

	public static void main(String[] args) {

   
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input:");
		int n=sc.nextInt();
		int c;
		System.out.println("Output:");
		for(int i=1;i<=10;i++)
			
		{
			c=i*n;
			System.out.print(c+"\t");
		}
		

	}

}
