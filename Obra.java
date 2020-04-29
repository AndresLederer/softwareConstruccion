package softwareParaLaConstruccion;

import java.util.*;

public abstract class Obra {
	//atributes
	private String address;
	private double totalSquareMts;
	private int estimatedDays;
	private double squareMtPrice;
	private ArrayList <Empleado> employees = new ArrayList<Empleado>(); //POR OBRA: 1 arq , 1 a 3 mm, 2 o más obr 
	
	//setters
	public void setAddress(String address) {
		this.address = address;
	}
	public void setTotalSquareMts(double totalSquareMts) {
		this.totalSquareMts = totalSquareMts;
	}
	public void setEstimatedDays(int estimatedDays) {
		this.estimatedDays = estimatedDays;
	}
	public void setSquareMtPrice(double squareMtPrice) {
		this.squareMtPrice = squareMtPrice;
	}
	public void setEmployees(ArrayList <Empleado> employees) {
		if(checkEmpleadosPorObra(employees)) {
			this.employees = employees; //la cantidad y tipo de empleados asigandos es correcta
		}else { //hay que chequear la cantidad y tipos de empleados asignados a esta obra
			System.out.println("Employees couldn't been assignated. Check the number and profesion of all assignated employees");
		}
	}
	
	//getters
	public String getAddress() {
		return address;
	}
	public double getTotalSquareMts() {
		return totalSquareMts;
	}
	public int getEstimatedDays() {
		return estimatedDays;
	}
	public double getsquareMtPrice() {
		return squareMtPrice;
	}
	public ArrayList <Empleado> getEmployees(){
		return employees;
	}
	
	//constructor
	public Obra(String address,double totalSuareMts,int estimatedDays,double squareMtPrice,ArrayList<Empleado> employees) {
		setAddress(address);
		setTotalSquareMts(totalSuareMts);
		setEstimatedDays(estimatedDays);
		setSquareMtPrice(squareMtPrice);
		setEmployees(employees);
	}
	
	//methods
	
	//shows all the employees working on the building
	public void showBuildingEmployees(){
		for(Empleado e : employees) {
			if(e instanceof Arquitecto) {
				System.out.println(((Arquitecto) e).toString());
			}
			if(e instanceof MaestroMayor) {
				System.out.println(((MaestroMayor) e).toString());
			}
			if(e instanceof Obrero) {
				System.out.println(((Obrero) e).toString());
			}
			System.out.println("------------------------------------------------------------");
		}
	}
	
	//checks type and number of employees(Empleado)
	private boolean checkEmpleadosPorObra(ArrayList<Empleado> employees) {
		boolean check = false;
		int arq = 0;
		int mm = 0;
		int obr = 0;
		for(Empleado e: employees) {
			if(e instanceof Arquitecto) arq++;
			if(e instanceof MaestroMayor) mm++;
			if(e instanceof Obrero) obr++;
		}
		if(arq==1 && mm>=1 && mm<=3 && obr>=2) {
			check = true;
		}
		return check;
	}
	
	//returns the construction final price
	public double getFinalPrice() {
		double finalPrice = (squareMtPrice * totalSquareMts)+(estimatedDays * employeesCostPerDay());
		return finalPrice;
	}
	
	//returns the employees cost per day
	private double employeesCostPerDay() {
		double costPerDay = 0;
		for(Empleado e : employees) {
			costPerDay += e.getPaymentPerDay();
		}
		return costPerDay;
	}
	
	//toString @Override
	@Override
	public String toString() {
		String string = String.format("Buildind address: %s\nTotal square mts: %.2f\nEstimated days: %d\nSquare mt price: $%.2f\n",getAddress(),getTotalSquareMts(),getEstimatedDays(),getsquareMtPrice());
		return string;
	}
}
