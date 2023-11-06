package codingtest.codeup.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1066 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
		String arr[] = br.readLine().split(" ");
		
		long a = Integer.parseInt(arr[0]);
		long b = Integer.parseInt(arr[1]);
		long c = Integer.parseInt(arr[2]);
		
		if(a%2 == 0) {
			bw.write("even"+"\n");
		}else {
			bw.write("odd"+"\n");
		}
			
		if(b%2 == 0) {
			bw.write("even"+"\n");
		}else {
			bw.write("odd"+"\n");
		}
			
		if(c%2 == 0) {
			bw.write("even"+"\n");
		}else {
			bw.write("odd"+"\n");
		}
		bw.flush();
		bw.close();
	}

}
