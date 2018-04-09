package com.javaex.ex03_phonedb_arraylist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneDBApp {

	public static void main(String[] args) throws IOException {

		List<Person> list = new ArrayList<Person>();// 제네릭(new 하는 순간 person만 담을 수 있는 arraylist가 됨)

		Reader fr = new FileReader("C:\\Users\\USER\\Desktop\\javaStudy\\file\\phoneDB.txt");

		BufferedReader br = new BufferedReader(fr);

		String line = "";

		while (true) {
			
			line = br.readLine();
			if(line == null) {
				break;
			}
			String[] personInfo = line.split(",");
			
			Person person = new Person(personInfo[0], personInfo[1], personInfo[2]);
			list.add(person);
		}
		
		for(Person p : list) {
			System.out.println("이름: " + p.getName());
			System.out.println("핸드폰: " + p.getHp());
			System.out.println("회사번호: " + p.getCompany());
			System.out.println("");
		}

		br.close();
	}

}
