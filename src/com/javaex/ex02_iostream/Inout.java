package com.javaex.ex02_iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Inout {

	public static void main(String[] args) throws IOException {
		/******** Scanner 구현 ***********/
		Reader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();

		//System.out.println(line);

		/******** println 구현 *********/

		Writer osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write(line);
		
		br.close();
		bw.close();

	}

}
