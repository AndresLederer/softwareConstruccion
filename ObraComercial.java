package softwareParaLaConstruccion;

import java.util.*;

public class ObraComercial extends Obra {
	//atributes
	private String buildingName;
	
	//setters
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	
	//getters
	public String getBuildingName() {
		return buildingName;
	}
	
	//constructor
	public ObraComercial(String address,double totalSquareMts,int estimatedDays,double squareMtPrice,ArrayList<Empleado> employees,String buildingName) {
		super(address,totalSquareMts,estimatedDays,squareMtPrice,employees);
		setBuildingName(buildingName);
	}
}

