package codingtest.codeup.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1065 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// arr 배열을 주고 spacebar로 나누는 줄
		String arr[] = br.readLine().split(" ");
		
		// arr배열에 0번째의 String을 인트형으로 변형
		long a = Integer.parseInt(arr[0]);
		long b = Integer.parseInt(arr[1]);
		long c = Integer.parseInt(arr[2]);
		if(a%2 == 0) {
			bw.write(String.valueOf(a)+"\n");
		}
		
		if(b%2 == 0) {
			bw.write(String.valueOf(b)+"\n");
		}
		
		if(c%2 == 0) {
			bw.write(String.valueOf(c)+"\n");
		};
		bw.flush();
		bw.close();
	}

}
