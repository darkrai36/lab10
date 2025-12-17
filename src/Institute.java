public class Institute {

	private String name;
	private String address;
	private ResearchAssociate researchAssociates;

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
		// TODO - implement Institute.addResearchAssociate
		throw new UnsupportedOperationException();
	}

}