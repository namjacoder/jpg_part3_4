package part3_4.co.kr;

import java.util.Scanner;

public class Caculator {
	
	//내가 코딩 
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] arr = input.split(" ");
		int result   = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) ;
		
		System.out.println("두 수의 합은 "+result+"입니다.");
	}
	
	
//	//풀이 소스
//	public static void main(String[] args) {
//		int a, b;
//		Scanner scanner = new Scanner(System.in);
//		String s1, s2;
//		System.out.println("두 수를 입력하세요.");
//		s1 = scanner.next();
//		s2 = scanner.next();
//		a = Integer.parseInt(s1);
//		b = Integer.parseInt(s2);
//		
//		System.out.printf("%d와 %d의 수의 합은 %d입니다.", a, b, a+b);
//	}
}
