package com.javaex.ex02_iostream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneDBApp {

	public static void main(String[] args) throws IOException {
		
		
		Reader fr = new FileReader("C:\\Users\\USER\\Desktop\\javaStudy\\file\\phoneDB.txt");//빨대꽂음

		BufferedReader br = new BufferedReader(fr);
		 
		String str = "";
		while(true) {
			//가까운 빨대-BufferedReader
			str = br.readLine(); //,붙은거를 한줄로 읽어오는거. 이제 세 개로 쪼개야 함.
			//System.out.println(str);
			
			if(str == null) {
				break;
			}
			String[] personInfo = str.split(",");
			
			String name = personInfo[0];
			String hp = personInfo[1];
			String company = personInfo[2];
			
			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + company);
			System.out.println("");
			
			
		}
		
		
		br.close();
		
		
		/******내가 한거*******/
		/*Reader fr = new FileReader("C:\\Users\\USER\\Desktop\\javaStudy\\file\\phoneDB.txt");

		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while (true) {
			str = br.readLine();
			if (str == null) {
				break;
			}
			System.out.println(str);
		}
		br.close();*/
	}

}
