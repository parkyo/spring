package basic1;

import basic1.entity.Exam;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import basic1.entity.NewLecExam;
import basic1.ui.ExamConsole;
import basic1.ui.GridExamConsole;
import basic1.ui.InLineExamConsole;

public class MainClass {

	public static void main(String[] args) {
		Exam exam = new NewLecExam(); //DI using setter
//		Exam exam = new NewLecExam(20,10,50); //DI using constructor
//		ExamConsole cons = new InLineExamConsole(exam);
		/*스프링에게 지시하는 방법으로 코드 변
		 * 
		 * ExamConsole cons = new GridExamConsole();
		cons.setExam(exam);
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("basic1/setting.xml");
		ExamConsole console = (ExamConsole) context.getBean("console");
//		ExamConsole console = context.getBean(ExamConsole.class);
		
		//콜렉션 생
		List<Exam> exams = (List<Exam>) context.getBean("exams"); 
//		exams.add(new NewLecExam(1,1,1));
		
		for (Exam e: exams) {
			System.out.println(e);
		}
		
		console.print();
	} 
	

}
