package com.javaex.ex01_iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteBufferStreamApp {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\Users\\USER\\Desktop\\javaStudy\\file\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);
		OutputStream out = new FileOutputStream("C:\\Users\\USER\\Desktop\\javaStudy\\file\\bytebuffimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
				
		int bData;
		
		System.out.println("복사시작(bufferedstream)");
		while(true) {
			bData = bin.read();
			if(bData == -1) {
				System.out.println("복사완료" + bData);
				break;
			}
			bout.write(bData);
			
		}
		
		
		bin.close();
		bout.close();

	}

}
