package codingtest.codeup.com;

import java.util.Scanner;

public class Q1049 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	두 정수(a, b)를 입력받아
		int a = sc.nextInt();
		int b = sc.nextInt();
//	a가 b보다 크면 1을, a가 b보다 작거나 같으면 0을 출력하는 프로그램을 작성해보자.
		if(a>b) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
//	예시
//	printf("%d", 123<456); //비교 연산자 < 의 계산 결과인 1(참)이 출력된다.
	}

}
