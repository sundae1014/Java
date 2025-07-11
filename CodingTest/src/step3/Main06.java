package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main06 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		 int T = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=T; i++) {
			String[] input = br.readLine().split(" ");
			int A = Integer.parseInt(input[0]);  
            int B = Integer.parseInt(input[1]); 
			
			if(A<=1000 && B<=1000) {
				bw.write((A+B)+"\n");
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}