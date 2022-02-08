package ch17;

public class WhileTest {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while(num <= 5) {
			sum += num; //sum = sum + num
			// 1 = 0 + 1
			// 3 = 1 + 2
			// 6 = 3 + 3
			// 10 = 6 + 4
			// 15 = 10 + 5
			num++;			
		}
	System.out.println(sum);
	System.out.println(num);
	}

}
