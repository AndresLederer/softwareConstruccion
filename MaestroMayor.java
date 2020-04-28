package softwareParaLaConstruccion;

public class MaestroMayor extends Empleado implements Construccion{
	//atributes
	private int age;
	
	//setters
	public void setAge(int age) {
		this.age = age;
	}
	
	//gettes
	public int getAge() {
		return age;
	}
	
	//constructor
	public MaestroMayor(String name,String personalIdNum,String tel,int age) {
		super(name,personalIdNum,tel,1800);
		setAge(age);
	}
	
	//methods
	
	//Construccion interface @Override
	@Override
	public void work() {
		System.out.println("I'm a construction master and I supervise the building");
	}
	
	
	//toString() @Override
	@Override 
	public String toString() {
		String string = super.toString() + String.format("Age: %d",getAge());
		return string;
	}
	
}
