package softwareParaLaConstruccion;

public class Obrero extends Empleado implements Construccion{
	//atributes
	private int age;
	
	//setters
	public void setAge(int age) {
		this.age = age;
	}
	
	//getters
	public int getAge() {
		return age;
	}
	
	//constructor
	public Obrero(String name,String personalIdNum,String tel,int age) {
		super(name,personalIdNum,tel,1500);
		setAge(age);
	}
	
	//methods
	
	//Construccion interface method @Override
	@Override
	public void work() {
		System.out.println("I'm a worker and I build");
	}
	
	//toString() @Override
	@Override
	public String toString() {
		String string = super.toString() + String.format("Age: %d",getAge());
		return string;
	}
}
