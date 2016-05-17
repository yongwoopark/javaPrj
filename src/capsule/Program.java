package capsule;

public class Program {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam exam = new Exam();
		//exam.setKor(exam, 30);
		//exam.kor = 30;
		Exam.setKor(exam, 30);
		
		Exam.getKor(exam);
				
		Exam.printExam(exam);
		
		
		//System .out.println(Exam.total(10, 10, 10));
	}

}
