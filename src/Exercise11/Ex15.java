package Exercise11;

class Employee{
	int eno;
	
	public Employee(int eno){
		this.eno = eno;
		System.out.println("Employee("+eno+")이 메모리에서 생성됨");
	}
	
	public void finalize() {
		System.out.println("Employee("+eno+")이 메모리에서 제거됨");
	}
}

public class Ex15 {
	
	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
		
		System.out.println("emp가 최종적으로 참조하는 사원번호: ");
		System.out.println(emp.eno);
		System.gc();

	}
	
}
