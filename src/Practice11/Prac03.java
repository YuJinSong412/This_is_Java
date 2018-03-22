package Practice11;

import java.util.HashMap;

class Student{
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentNum() {
		return studentNum;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if(studentNum.equals(s.studentNum)) {
				return true;
			}
		}
		return false;
	}
	public int hasCode() {
		return studentNum.hashCode();
	}
}
public class Prac03 {

	public static void main(String[] args) {
		HashMap<Student,String> hashMap = new HashMap<Student,String>();
		
		hashMap.put(new Student("1"), "95");
		
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점: "+score);

	}

}
