public class Course {

	private int id;
	private String name;
	private float hours;

	public int getId() {
		return this.id;
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

	public float getHours() {
		return this.hours;
	}

	/**
	 * 
	 * @param hours
	 */
	public void setHours(float hours) {
		this.hours = hours;
	}

}