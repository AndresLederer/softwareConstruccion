package softwareParaLaConstruccion;

import java.util.*;

public class Hotel extends ObraComercial{
	//atributes
	private int floors;
	
	//setters
	public void setFloors(int floors) {
		this.floors = floors;
	}
	
	//getters
	public int getFloors() {
		return floors;
	}
	
	//constructor
	public Hotel(String address,double totalSquareMts,int estimatedDays,double squareMtPrice,ArrayList<Empleado> employees,String buildingName,int floors) {
		super(address,totalSquareMts,estimatedDays,squareMtPrice,employees,buildingName);
		setFloors(floors);
	}
}
