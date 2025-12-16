import java.util.List;

public class Lecturer extends ResearchAssociate {

	private List<Course> taughtCourses;

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

	public void teachCourse() {
		// TODO - implement Lecturer.teachCourse
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param course
	 */
	public void addCourse(Course course) {
		// TODO - implement Lecturer.addCourse
		throw new UnsupportedOperationException();
	}

}