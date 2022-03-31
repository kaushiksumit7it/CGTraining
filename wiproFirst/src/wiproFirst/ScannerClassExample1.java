package wiproFirst;

import java.util.*;

public class ScannerClassExample1 {
	public static void main(String args[]) {
		String s = "Hello, This is Java Based Scanner Program to take input from KeyBoard.";
		
//		String name1="Sumit";
//		int age1=31;
//		double sal=30.2;
		// Create scanner Object and pass string in it
		
		System.out.println("--------Enter Your Details-------- ");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = in.next();
		System.out.println("Name: " + name);
		System.out.print("Enter your age: ");
		int i = in.nextInt();
		System.out.println("Age: " + i);
		System.out.print("Enter your salary: ");
		double d = in.nextDouble();
		System.out.println("Salary: " + d);
		in.close();
	}
}