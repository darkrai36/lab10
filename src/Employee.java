public class Employee {

	private int id;
	private String name;
	private String email;
	private double salary;
	private String position;
	private static int counter = 1;

	public Employee(int id, String name, String email, double salary, String position) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.position = position;
	}

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return this.salary;
	}

	/**
	 * 
	 * @param salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return this.position;
	}

	/**
	 * 
	 * @param position
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	public int getCounter() {return counter;}

	public void increaseCount() {
		counter++;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}