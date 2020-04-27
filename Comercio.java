package softwareParaLaConstruccion;

import java.util.*;

public class Comercio extends ObraComercial{
	//atributes
	private String entry;
	
	//setters
	public void setEntry(String entry) {
		this.entry = entry;
	}
	
	//getters
	public String getEntry() {
		return entry;
	}
	
	//constructor
	public Comercio(String address,double totalSquareMts,int estimatedDays,double squareMtPrice,ArrayList<Empleado> employees,String buildingName,String entry) {
		super(address,totalSquareMts,estimatedDays,squareMtPrice,employees,buildingName);
		setEntry(entry);
	}
	
}
