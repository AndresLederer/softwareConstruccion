package softwareParaLaConstruccion;

public abstract class Empleado {
	//atributes
	private String name;
	private String personalIdNum;
	private String tel;
	private final double paymentPerDay;
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setPeronsalIdNum(String personalIdNum) {
		this.personalIdNum = personalIdNum;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public String getPersonalIdNum() {
		return personalIdNum;
	}
	public String getTel() {
		return tel;
	}
	public double getPaymentPerDay() {
		return paymentPerDay;
	}
	
	//constructor
	public Empleado(String name,String personalIdNum,String tel,double paymetPerDay) {
		setName(name);
		setPeronsalIdNum(personalIdNum);
		setTel(tel);
		this.paymentPerDay = paymetPerDay;
	}
	
	//methods
	//toString() @Override
	@Override 
	public String toString() {
		String string = String.format("Full name: %s\nPersonal ID: %s\nTel: %s\nPayment per day: %.2f\n",getName(),getPersonalIdNum(),getTel(),getPaymentPerDay());
		return string;
	}
}
