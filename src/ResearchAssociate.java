import java.util.List;

public class ResearchAssociate extends Employee {

	private String fieldOfStudy;
	private Project projects;
	private List<Participation> participations;

	public String getFieldOfStudy() {
		return this.fieldOfStudy;
	}

	/**
	 * 
	 * @param fieldOfStudy
	 */
	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	public Project getProjects() {
		return this.projects;
	}

	/**
	 * 
	 * @param projects
	 */
	public void setProjects(Project projects) {
		this.projects = projects;
	}

	public List<Participation> getParticipations() {
		return this.participations;
	}

	/**
	 * 
	 * @param participations
	 */
	public void setParticipations(List<Participation> participations) {
		this.participations = participations;
	}

	/**
	 * 
	 * @param participation
	 */
	public void addParticipation(Participation participation) {
		// TODO - implement ResearchAssociate.addParticipation
		throw new UnsupportedOperationException();
	}

}