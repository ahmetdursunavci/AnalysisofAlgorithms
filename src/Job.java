
public class Job  {
	private String name;
	private int salary;
	
	public Job(String n,int s) {
		name=n;
		salary=s;
		
	}
	
	public void set_name(String n) {
		name=n;
	}
	public String get_name() {
		return this.name;
	}
	public void set_salary(int s) {
		salary=s;
	}
	public int get_Salary() {
		return this.salary;
	}


	
}
