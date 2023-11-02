package codingtest.codeup.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1061 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		입력된 정수 두 개를 비트단위로 or 연산한 후 그 결과를 정수로 출력해보자.
		
		String[] num = br.readLine().split(" ");
		long a = Integer.parseInt(num[0]);
		long b = Integer.parseInt(num[1]);
//		비트단위(bitwise) 연산자 |(or, vertical bar, 버티컬바)를 사용하면 된다.
		
		bw.write(String.valueOf(a | b));
		bw.flush();
		bw.close();
	}

}
