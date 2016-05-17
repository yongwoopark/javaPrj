package collection.object;

public class ObjectCollection {
	private Object[] data;// = new Exam[3];
	private int current;// = -1;
	private int capacity;// 용량;
	private int amount; // 추가 증가량
	
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
		
		// 만약에 공간이 모자라면
		if(capacity <= current)
		{
			// 공간을 늘려준다.
			// 1. 새로운 크기의 배열을 만드는거야
			Object[] temp = new Object[capacity+amount];
			// 2. exams 배열에 들어있는 객체를 temp 배열로 옮겨야 한다.
			for(int i=0; i<capacity; i++)
				temp[i] = data[i];
			
			// 3. 기존의 배열은 버려질 필요가 있고요. 새로운 배열이 현재 참조되는 배열이 되어야 한다.
			data = temp;
			
			// 4. 늘어난 용량이 새로운 값으로 대치되어야 겠지요?
			capacity += amount;
		}
		
		data[current] = exam;		
	}
}




