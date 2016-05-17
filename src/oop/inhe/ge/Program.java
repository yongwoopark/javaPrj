package oop.inhe.ge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	
	
	
	public static void print(){
		
	}
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("hello");
		list.add("ok");
		list.add("hello");
		list.add("ok");
		
		/*for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));	*/	
		
		for(String s : list)
			System.out.println(s);
		
		System.out.println("-----<Set>--------");
		
		Set<String> sets = new HashSet<>();
		sets.add("23");
		sets.add("5");
		sets.add("12");
		sets.add("7");
		
		System.out.println(sets);
		/*for(String s : sets)
			System.out.println(s);*/
		
		Set<String> tset = new TreeSet<>();
		tset.add("23");
		tset.add("5");
		tset.add("12");
		tset.add("7");
		
		System.out.println(tset);
		
		System.out.println("-----<Map>--------");
		Map<String, String> m = new HashMap<>();
		m.put("name", "홍길동");
		m.put("addr", "서울시 마포구");
		m.put("name", "김길동");
		
		System.out.println(m.get("name"));
		
		
		/*
		Iterator<String> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		*/		
		
		//GCollection list = new 
		
		
		// TODO Auto-generated method stub
		/*ExamConsole console = new ExamConsole();
		
		console.input();
		console.print();*/
		//exam.setKor(exam, 30);
		//exam.kor = 30;
		//Exam.setKor(exam, 30);
		//exam.setKor(30);
		
		
				
		//Exam.printExam(exam);
	
		
		
		//System .out.println(Exam.total(10, 10, 10));
	}

}
