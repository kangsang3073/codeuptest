package codingtest.codeup.com;

import java.util.Scanner;

public class Q1059 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
//		입력 된 정수를 비트단위로 참/거짓을 바꾼 후 정수로 출력해보자.
		long a = sc.nextLong(); 
		System.out.printf("%d",~a);
//		비트단위(bitwise)연산자 ~ 를 붙이면 된다.(~ : tilde, 틸드라고 읽는다.)
	}

}
