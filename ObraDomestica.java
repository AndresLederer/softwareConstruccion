package softwareParaLaConstruccion;

import java.util.*;

public class ObraDomestica extends Obra{
	//atributes
	private int rooms;
	
	//setters
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	
	//getters
	public int getRooms() {
		return rooms;
	}
	
	//constructor
	public ObraDomestica(String address,double totalSquareMts,int estimatedDays,double squareMtPrice,ArrayList<Empleado> employees,int rooms) {
		super(address,totalSquareMts,estimatedDays,squareMtPrice,employees);
		setRooms(rooms);
	}
	
	//toString @Override
	@Override
	public String toString() {
		String string = super.toString();
		string += String.format("Rooms: %d",getRooms());
		return string;
	}
	
}
