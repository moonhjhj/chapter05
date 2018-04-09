package com.javaex.ex02_iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamApp {

	public static void main(String[] args) throws IOException {
		
		/*
		*//******* 메모장에 쓰기 *********//*

		Writer fw = new FileWriter("C:\\Users\\USER\\Desktop\\javaStudy\\file\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("학교종이 땡땡땡");
		bw.newLine();// 줄바꿈
		bw.write("어서 모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다");
		bw.close();
*/
		
		/********메모장에서 읽어오기*********/
		Reader fr = new FileReader("C:\\Users\\USER\\Desktop\\javaStudy\\file\\song.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str = "";
		while(true) {
			str = br.readLine(); //한줄씩 읽어옴 --> 줄바꿈 기호 제외
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		fr.close();
	}

}
