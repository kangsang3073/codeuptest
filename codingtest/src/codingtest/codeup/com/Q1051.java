package codingtest.codeup.com;

import java.util.Scanner;

public class Q1051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		두 정수(a, b)를 입력받아
		int a = sc.nextInt();
		int b = sc.nextInt();
//		b가 a보다 크거나 같으면 1을, 그렇지 않으면 0을 출력하는 프로그램을 작성해보자.
		if(b >= a) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}
