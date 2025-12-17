import java.util.ArrayList;
import java.util.List;

public class Lecturer extends ResearchAssociate {

	private List<Course> taughtCourses;

	public Lecturer(int id, String name, String email, double salary, String position, List<Course> taughtCourses) {
		super(id, name, email, salary, position);
		this.taughtCourses = new ArrayList<>();
	}

	public List<Course> getTaughtCourses() {
		return this.taughtCourses;
	}


	/**
	 * 
	 * @param taughtCourses
	 */
	public void setTaughtCourses(List<Course> taughtCourses) {
		this.taughtCourses = taughtCourses;
	}

	public void teachCourse(Course course) {
		System.out.println("Lecturer " + this.getName() + " teaches course '" + course.getName() + "'.");
	}

	/**
	 * 
	 * @param course
	 */
	public void addCourse(Course course) {
		this.taughtCourses.add(course);
	}

	@Override
	public String toString() {
		return "Our lecturer - " + this.getName() + ". His e-mail: " + this.getEmail();
	}
}