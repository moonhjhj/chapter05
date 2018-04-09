package com.javaex.ex01_iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamApp {

	public static void main(String[] args) throws IOException {
		/*이미지 복사하기*/
		
		/*********속도 빠름  : buff *********/
		InputStream in = new FileInputStream("C:\\Users\\USER\\Desktop\\javaStudy\\file\\img.jpg"); // (file inputstream)시야는 inputstream까지밖에. 
		OutputStream out = new FileOutputStream("C:\\Users\\USER\\Desktop\\javaStudy\\file\\byteimg.jpg");
		int bData;
		byte[] buff = new byte[1024]; 
		System.out.println("복사시작");
		while(true) {//데이터 빨대꼽아서 다 빨아들일때까지 while문 돌림
			//in.read(); //read 메소드. ==>담을 곳 필요(bData). 얘의 return형은 integer.
			bData = in.read(buff);
			//out.write(bData);
			if(bData == -1) {
				System.out.println("복사가 완료되었습니다." + bData);
				break;
			}
		}
/*********속도 느림***********/
		/*int bData;
		
		System.out.println("복사시작");
		while(true) {//데이터 빨대꼽아서 다 빨아들일때까지 while문 돌림
			//in.read(); //read 메소드. ==>담을 곳 필요(bData). 얘의 return형은 integer.
			bData = in.read();
			//out.write(bData);
			if(bData == -1) {
				System.out.println("복사가 완료되었습니다." + bData);
				break;
			}
		}*/

	}

}
