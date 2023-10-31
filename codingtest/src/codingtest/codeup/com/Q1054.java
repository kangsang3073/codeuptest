package codingtest.codeup.com;

import java.util.Scanner;

public class Q1054 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		두 개의 참(1) 또는 거짓(0)이 입력될 때,
		long a = sc.nextLong();
		long b = sc.nextLong();
//		모두 참일 때에만 참을 출력하는 프로그램을 작성해보자.
		if (a != 0 && b !=0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
//		예시
//		printf("%d", 1&&1); //둘 다 참을 의미하므로 1로 계산되어 출력된다.
	}

}
