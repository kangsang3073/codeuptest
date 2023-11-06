package codingtest.codeup.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1067 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String arr[] = br.readLine().split(" ");
		
		long a = Integer.parseInt(arr[0]);
		
		if(a%2 == 0) {
			if(a < 0) {
				bw.write(String.valueOf("minus"+"\n"));
			}else {
				bw.write(String.valueOf("plus"+"\n"));
			}
			
			bw.write(String.valueOf("even"));
		}else {
			if(a < 0) {
				bw.write(String.valueOf("minus"+"\n"));
			}else {
				bw.write(String.valueOf("plus"+"\n"));
			}
			bw.write(String.valueOf("odd"));
		}
		bw.flush();
		bw.close();
	}

}
