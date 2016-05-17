package collection.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import collection.generic.GCollection.Iterator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCollection list = new GCollection();
		
		for(int i=0; i<300; i++)
			list.add(i+1);
		
		// 다른 흐름 ( 다른 줄에 세울까?)	// 흐름 : Thread -> run()
		Thread th = new Thread(new Runnable() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				print(2, list);
			}
		});
		
		th.start();
		//print(2, list);
		print(1, list);
		
		// 컬렉션
		// 배열(저장소)
		// + current(저장소 관리)
		// + capacity(점진적인 증가)
		// + index(나눠서 사용하기)
		
		/*for(int i=0; i<100; i++)// 개수나 위치를 사용 흐름에서 결정
			list.get(i);*/
		
		// 인덱스를 관리하는 것은 알아서 자동적으로 자신이.....
		
		/*list.clear();
		while(list.hasNext())
			System.out.println(list.next());	*/			
	}
	
	private static void print(int key, GCollection list) {
		/*for(int i=0; i<300; i++)		
			System.out.printf("key : %d, value : %d\n", key, list.get(i));*/
				
		/*list.clear();
		while(list.hasNext())
			System.out.printf("key : %d, value : %d\n", key, list.next());*/
		ArrayList a = new ArrayList<>();
		
		Map<String, String> m = new HashMap<>();
		
		Iterator it = list.iterator();
		it.clear();
		while(it.hasNext())
			System.out.printf("key : %d, value : %d\n", key, it.next());
			
							
	}

}
