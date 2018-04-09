package com.javaex.ex02_iostream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ms949App {

	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("C:\\Users\\USER\\Desktop\\javaStudy\\file\\MS949.txt");
				
		InputStreamReader isr = new InputStreamReader(is, "MS949"); //뭘로 해석할지 알려줘야 함.
		BufferedReader br = new BufferedReader(isr);
		
		String line = "";
		while(true) {
			line = br.readLine();//한줄 읽어오는거. MS949번역해서 올라오고 있음.
			
			if(line == null) {
				break;
			}
			System.out.println(line);
			
			
		}
		
		br.close();

	}

}
