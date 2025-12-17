public class Participation {

	private int hours;
	private ResearchAssociate researchAssociate;
	private Project project;

	public Participation(int hours, ResearchAssociate researchAssociate, Project project) {
		this.hours = hours;
		this.researchAssociate = researchAssociate;
		this.project = project;
	}

	public int getHours() {
		return this.hours;
	}

	/**
	 * 
	 * @param hours
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	public ResearchAssociate getResearchAssociate() {
		return this.researchAssociate;
	}

	/**
	 * 
	 * @param researchAssociate
	 */
	public void setResearchAssociate(ResearchAssociate researchAssociate) {
		this.researchAssociate = researchAssociate;
	}

	public Project getProject() {
		return this.project;
	}

	/**
	 * 
	 * @param project
	 */
	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Participation{" +
				"hours=" + hours +
				", researchAssociate=" + researchAssociate +
				", project=" + project +
				'}';
	}
}