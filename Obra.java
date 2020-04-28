package softwareParaLaConstruccion;

import java.util.*;

public abstract class Obra {
	//atributes
	private String address;
	private double totalSquareMts;
	private int estimatedDays;
	private double squareMtPrice;
	private ArrayList <Empleado> employees;
	
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
//		if(checkEmployees(employees)) {
			this.employees = employees;
//		}else {
//			System.out.println("Chequear cantidad y tipos de empleados asignados a la obra");
//		}
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
	
//	//returns a String with all the employees data
//	private String allEmployeesInString() {
//		String allEmployeesData = null;
//		for(Empleado e : employees) {
//			if(e instanceof Arquitecto) {
//				allEmployeesData += ((Arquitecto) e).toString();
//			}
//			if(e instanceof MaestroMayor) {
//				allEmployeesData += ((MaestroMayor) e).toString();
//			}
//			if(e instanceof Obrero) {
//				allEmployeesData += ((Obrero) e).toString();
//			}
//		}
//		return allEmployeesData;
//	}
}





















