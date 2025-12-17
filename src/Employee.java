public class Employee {

	private int id;
	private String name;
	private String email;
	private double salary;
	private String position;
	private int counter;

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

	public int getCounter() {
		return this.counter;
	}

	/**
	 * 
	 * @param counter
	 */
	public void setCounter(int counter) {
		this.counter = counter;
	}

	public void increaseCount() {
		// TODO - implement Employee.increaseCount
		throw new UnsupportedOperationException();
	}

}