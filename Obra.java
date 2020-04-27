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
		this.employees = employees;
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
	
	//returns the employees cost per building day
	private double employeesCostPerDay() {
		double costPerDay = 0;
		for(Empleado e : employees) {
			costPerDay += e.getPaymentPerDay();
		}
		return costPerDay;
	}
}





















