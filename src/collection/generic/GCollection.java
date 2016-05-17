package collection.generic;

public class GCollection<T> {
	private T[] data;// = new Exam[3];
	private int current;// = -1;
	private int capacity;// �뷮;
	private int amount; // �߰� ������	
	public class Iterator{
		private int index; // ���Ÿ� ���� �ʵ�		
		public Iterator() { index = -1; }		
		public T next() {			
			return data[++index];
		}	
		public boolean hasNext() {
					
			return index < current;
		}		
		public void clear() {
			index = -1;		
		}
	}
	public Iterator iterator() {
		return new Iterator();
	}
	
	public GCollection() {
		capacity = 3;
		amount = 5;
		data = (T[]) new Object[capacity];
		current = -1;
		
	}
	
	public int size() {		
		return current+1;
	}

	public T get(int i) {		
		return data[i];
	}

	public void add(T exam) {
		current++;
		
		// ���࿡ ������ ���ڶ��
		if(capacity <= current)
		{
			// ������ �÷��ش�.
			// 1. ���ο� ũ���� �迭�� ����°ž�
			T[] temp = (T[]) new Object[capacity+amount];
			// 2. exams �迭�� ����ִ� ��ü�� temp �迭�� �Űܾ� �Ѵ�.
			for(int i=0; i<capacity; i++)
				temp[i] = data[i];
			
			// 3. ������ �迭�� ������ �ʿ䰡 �ְ��. ���ο� �迭�� ���� �����Ǵ� �迭�� �Ǿ�� �Ѵ�.
			data = temp;
			
			// 4. �þ �뷮�� ���ο� ������ ��ġ�Ǿ�� ������?
			capacity += amount;
		}
		
		data[current] = exam;		
	}	


}




