package basic1.ui;

import basic1.entity.Exam;

public class InLineExamConsole implements ExamConsole {
	private Exam exam;
	
	
	public InLineExamConsole() {
		
	}
	
	public InLineExamConsole(Exam exam) {
		this.exam = exam;
	}


	@Override
	public void print() {
		System.out.printf("total is %d, avg is %d\n", exam.total(), exam.avg());
	}


	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		this.exam = exam;
		
	}

}
