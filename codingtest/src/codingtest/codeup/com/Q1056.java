package codingtest.codeup.com;

import java.util.Scanner;

public class Q1056 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		두 가지의 참(1) 또는 거짓(0)이 입력될 때,
		long a = sc.nextLong();
		long b = sc.nextLong();
//		참/거짓이 서로 다를 때에만 참을 출력하는 프로그램을 작성해보자.
		if(a != b) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
//		예시
//		printf(“%d”, (a&&!b)||(!a&&b)); //참/거짓이 서로 다를 때에만 1로 계산		
	}

}
