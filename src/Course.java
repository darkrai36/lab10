public class Course {

	private int id;
	private String name;
	private float hours;

	public Course(int id, String name, float hours) {
		this.id = id;
		this.name = name;
		this.hours = hours;
	}

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

	@Override
	public String toString() {
		return "Course{" +
				"id=" + id +
				", name='" + name + '\'' +
				", hours=" + hours +
				'}';
	}
}