package codingtest.codeup.com;

import java.util.Scanner;

public class Q1063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		입력된 두 정수 a, b 중 큰 값을 출력하는 프로그램을 작성해보자.
		long a = sc.nextLong();
		long b = sc.nextLong();
//		단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.
		System.out.printf("%d",a>b?a:b);
	}

}
