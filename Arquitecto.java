package softwareParaLaConstruccion;

public class Arquitecto extends Empleado{
	//atributes
	private final int registrationNumber;
	
	//getters
	public int getRegistrationNumber() {
		return registrationNumber;
	}
	
	//constructor
	public Arquitecto(String name,String personalIdNum,String tel,int registrationNumber) {
		super(name,personalIdNum,tel,2000);
		this.registrationNumber = registrationNumber;
	}
	
	//methods
	public void designPlans() {
		System.out.println("I'm an architect designing my next plans");
	}
	
	//toString() @Override
	@Override
	public String toString() {
		String string = super.toString() + String.format("Registration number: %d\nProfesion: ARCHITECT",getRegistrationNumber());
		return string;
	}
}
