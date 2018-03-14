package Practice08;

interface DataAccessObject{
	public void select();
	public void insert();
	public void update();
	public void delete();
}
class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
		
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에 삽입");
		
	}

	@Override
	public void update() {
		System.out.println("Oracle DB를 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
		
	}
	
}
class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySqlDao DB에서 검색");
		
	}

	@Override
	public void insert() {
		System.out.println("MySqlDao DB에 삽입");
		
	}

	@Override
	public void update() {
		System.out.println("MySqlDao DB를 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("MySqlDao DB에서 삭제");
		
	}
	
}
public class Prac04 {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());

	}

}
