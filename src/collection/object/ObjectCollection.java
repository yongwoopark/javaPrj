package collection.object;

public class ObjectCollection {
	private Object[] data;// = new Exam[3];
	private int current;// = -1;
	private int capacity;// �뷮;
	private int amount; // �߰� ������
	
	public ObjectCollection() {
		capacity = 3;
		amount = 5;
		data = new Object[capacity];
		current = -1;
	}

	public int size() {		
		return current+1;
	}

	public Object get(int i) {		
		return data[i];
	}

	public void add(Object exam) {
		current++;
		
		// ���࿡ ������ ���ڶ��
		if(capacity <= current)
		{
			// ������ �÷��ش�.
			// 1. ���ο� ũ���� �迭�� ����°ž�
			Object[] temp = new Object[capacity+amount];
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




