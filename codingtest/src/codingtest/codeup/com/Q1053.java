package codingtest.codeup.com;

import java.util.Scanner;

public class Q1053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//		1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때
		int a = sc.nextInt();
	//		반대로 출력하는 프로그램을 작성해보자.
		if(a == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
