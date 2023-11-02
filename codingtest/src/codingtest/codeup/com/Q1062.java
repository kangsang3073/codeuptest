package codingtest.codeup.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1062 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		입력된 정수 두 개를 비트단위로 xor 연산한 후 그 결과를 정수로 출력해보자.
		String arr[] = br.readLine().split(" ");
		long a = Integer.parseInt(arr[0]);
		long b = Integer.parseInt(arr[1]);
//		비트단위(bitwise) 연산자 ^(xor, circumflex/caret, 서컴플렉스/카릿)를 사용하면 된다.
		bw.write(String.valueOf(a^b));
		bw.flush();
		bw.close();
	}

}
