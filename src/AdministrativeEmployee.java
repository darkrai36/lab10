public class AdministrativeEmployee extends Employee {


	public AdministrativeEmployee(int id, String name, String email, double salary, String position) {
		super(id, name, email, salary, position);
	}

	public void manageWork() {
		System.out.println("Admin " + this.getName() + " works very nice!");
	}

	@Override
	public String toString() {
		return "These admin: " + this.getName() + " works in VSU!";
	}
}