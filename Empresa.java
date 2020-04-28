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
	public Empresa(String companyName,ArrayList<Empleado> companyEmployees,ArrayList<Obra> companyBuildings) {
		this.companyName = companyName;
		setCompanyEmployees(companyEmployees);
		setCompanyBuildings(companyBuildings);
	}
		
	public void showBuildingsAndFinalPrices() {
		int contador = 1;
		for(Obra o : companyBuildings) {
			if(o instanceof ObraDomestica) {
				System.out.println(String.format("%d) Obra Domestica - Final price: $%.2f",contador,o.getFinalPrice()));
			}
			if(o instanceof Hotel) {
				System.out.println(String.format("%d) Hotel - Final price: $%.2f",contador,o.getFinalPrice()));
			}
			if(o instanceof Comercio) {
				System.out.println(String.format("%d) Comercio - Final price: $%.2f",contador,o.getFinalPrice()));
			}
			contador++;
		}
	}
}
