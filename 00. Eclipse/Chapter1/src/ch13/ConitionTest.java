package ch13;

import java.util.Scanner;

public class ConitionTest {

	public static void main(String[] args) {

	
		
		System.out.println("두수를 입력받자\n");
		Scanner scan = new Scanner(System.in);
				
		System.out.println("1:");
		int num1 = scan.nextInt();
		System.out.println("2:");
		int num2 = scan.nextInt();

		int max;
		max = (num1 > num2)? num1 : num2;
		System.out.println(max);
	}

}
