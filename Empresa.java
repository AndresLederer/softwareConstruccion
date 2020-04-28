package softwareParaLaConstruccion;

import java.util.*;

public class Empresa {
	//atributes
	private final String companyName;
	private ArrayList <Empleado> companyEmployees;
	private ArrayList<Obra> companyBuildings;
	
	//setters
	public void setCompanyEmployees(ArrayList<Empleado> companyEmployees) {
		this.companyEmployees = companyEmployees;
	}
	public void setCompanyBuildings(ArrayList<Obra> companyBuildings) {
		this.companyBuildings = companyBuildings;
	}
	
	//getters
	public String getCompanyName() {
		return companyName;
	}
	public ArrayList<Empleado> getCompanyEmployees(){
		return companyEmployees;
	}
	public ArrayList<Obra> getCompanyBuildings(){
		return companyBuildings;
	}
	
	//constructor
	public Empresa(String companyName) {
		this.companyName = companyName;
		setCompanyBuildings(new ArrayList<Obra>());
	}
}
