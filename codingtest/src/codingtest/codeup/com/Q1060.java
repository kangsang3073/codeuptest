package codingtest.codeup.com;

import java.util.Scanner;

public class Q1060 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		입력된 정수 두 개를 비트단위로 and 연산한 후 그 결과를 정수로 출력해보자.
		long a = sc.nextLong();
		long b = sc.nextLong();
//		비트단위(bitwise)연산자 &를 사용하면 된다.(and, ampersand, 앰퍼센드라고 읽는다.)
		long t = 1;
		System.out.printf("%d", a & b);
//		** 비트단위(bitwise)연산자는,
//		~(bitwise not), &(bitwise and), |(bitwise or), ^(bitwise xor),
//		<<(bitwise left shift), >>(bitwise right shift)
//		가 있다.
	}

}
