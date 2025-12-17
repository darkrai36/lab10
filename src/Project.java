import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Project {

	private String name;
	private Date start;
	private Date end;
	private List<Participation> participations;

	public Project(String name, Date start, Date end, List<Participation> participations) {
		this.name = name;
		this.start = start;
		this.end = end;
		this.participations = new ArrayList<>();
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

	public Date getStart() {
		return this.start;
	}

	/**
	 * 
	 * @param start
	 */
	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return this.end;
	}

	/**
	 * 
	 * @param end
	 */
	public void setEnd(Date end) {
		this.end = end;
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

	public int calculateDuration() {
		// TODO - implement Project.calculateDuration
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param participation
	 */
	public void addParticipation(Participation participation) {
		this.participations.add(participation);
		System.out.println("Participation added successfully!");
	}

	@Override
	public String toString() {
		return "Project name: " + this.name + ". It starts on " + this.start.toString() + ". It ends on " + this.end.toString();
	}
}