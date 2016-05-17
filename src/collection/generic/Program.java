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
		
		// �ٸ� �帧 ( �ٸ� �ٿ� �����?)	// �帧 : Thread -> run()
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
		
		// �÷���
		// �迭(�����)
		// + current(����� ����)
		// + capacity(�������� ����)
		// + index(������ ����ϱ�)
		
		/*for(int i=0; i<100; i++)// ������ ��ġ�� ��� �帧���� ����
			list.get(i);*/
		
		// �ε����� �����ϴ� ���� �˾Ƽ� �ڵ������� �ڽ���.....
		
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
