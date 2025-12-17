import java.util.List;

public class Institute {

	private String name;
	private String address;
	private List<ResearchAssociate> researchAssociates;

	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
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

	public String getAddress() {
		return this.address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 
	 * @param associate
	 */
	public void addResearchAssociate(ResearchAssociate associate) {
		this.researchAssociates.add(associate);
		System.out.println("Research Associate " + associate.getName() + " добавлен.");
	}

	@Override
	public String toString() {
		return "Our institute name - " + this.name + ". Its address - " + this.address;
	}
}