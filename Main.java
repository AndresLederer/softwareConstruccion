package softwareParaLaConstruccion;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		

		//instancio empleados de la empresa
		//arquitectos
		Empleado e0 = new Arquitecto("Laura Ibañez","10.789.101","223 510789",1010);
		Empleado e1 = new Arquitecto("Horacio Weber","11.789.456","223 511456",1111);
		Empleado e2 = new Arquitecto("Marta Castillo","21.456.111","223 521165",1212);
		//maestros maoyres de obra
		Empleado e3 = new MaestroMayor("Augusto Fleme","12.456.789","223 512789",56);
		Empleado e4 = new MaestroMayor("Alejandra Uribarri","14.234.123","223 614123",48);
		Empleado e5 = new MaestroMayor("Guillermo Juncos","237.987.321","223 6237987",50);
		Empleado e6 = new MaestroMayor("Maximiliano Gutierrez","13.123.321","223 513321",52);
		//obreros
		Empleado e7 = new Obrero("Alejandro Arquri","15.456.123","223 615123",33);
		Empleado e8 = new Obrero("Juan Erasun","16.987.321","223 416321",28);
		Empleado e9 = new Obrero("Adrián Suarez","24.564.321","223 156789",48);
		Empleado e10 = new Obrero("Sergio Di Santos","27.657.851","223 684523",50);
		Empleado e11 = new Obrero("Julio Arquri","28.654.231","011 546325",23);
		Empleado e12 = new Obrero("Ignacio Minuchín","27.845.885","223 522623",25);
		
		//agrupo los empleados 
		ArrayList <Empleado> allCompanyEmployees = new ArrayList<Empleado>();
		allCompanyEmployees.add(e0);
		allCompanyEmployees.add(e1);
		allCompanyEmployees.add(e2);
		allCompanyEmployees.add(e3);
		allCompanyEmployees.add(e4);
		allCompanyEmployees.add(e5);
		allCompanyEmployees.add(e6);
		allCompanyEmployees.add(e7);
		allCompanyEmployees.add(e8);
		allCompanyEmployees.add(e9);
		allCompanyEmployees.add(e10);
		allCompanyEmployees.add(e11);
		allCompanyEmployees.add(e12);
		
		
		//defino empleados para la Obra ob1 (ObraDomestica)
		ArrayList<Empleado> ob1Employees = new ArrayList<Empleado>();
		ob1Employees.add(e1);
		ob1Employees.add(e3);
		ob1Employees.add(e8);
		ob1Employees.add(e9);
		ob1Employees.add(e10);
		
		//instancio la primera Obra -> obraDomestica1
		Obra obraDomestica1 = new ObraDomestica("First Road 123",210,340,10.5,ob1Employees,5);
		
		//defino empleados para la Obra ob2 (Hotel)
		ArrayList<Empleado> ob2Employees = new ArrayList<Empleado>();
		ob2Employees.add(e0);
		ob2Employees.add(e5);
		ob2Employees.add(e7);
		ob2Employees.add(e8);
		ob2Employees.add(e11);
		ob2Employees.add(e12);
		
		//instancio la segunda Obra -> hotel1
		Obra hotel1 = new Hotel("Second Road 456",320,730,20.2,ob2Employees,"Hotel I",25);
		
		//defino empleados para la Obra ob2 (Comercio)
		ArrayList<Empleado> ob3Employees = new ArrayList<Empleado>();
		ob3Employees.add(e2);
		ob3Employees.add(e3);
		ob3Employees.add(e4);
		ob3Employees.add(e5);
		ob3Employees.add(e12);
		ob3Employees.add(e11);
		ob3Employees.add(e10);
		ob3Employees.add(e9);
		ob3Employees.add(e8);
		ob3Employees.add(e7);
		
		//instancio la tercera Obra -> comercio1
		Obra comercio1 = new Comercio("Third Road 789",80,365,8,ob3Employees,"Comercio I","Restaurant");
		
		//agrego cada Obra al AL de todas las Obras
		ArrayList <Obra> allCompanyBuildings = new ArrayList<Obra>();
		allCompanyBuildings.add(obraDomestica1);
		allCompanyBuildings.add(hotel1);
		allCompanyBuildings.add(comercio1);

		
		
		
		
		
		//instancio una nueva Empresa con los elementos creados previamente
		Empresa its = new Empresa("Its",allCompanyEmployees,allCompanyBuildings);
		
		//muestro costo estimado de una obra
		System.out.println(String.format("Precio final de obra \"HOTEL I\": $%.2f",its.getCompanyBuildings().get(1).getFinalPrice()));
		
		//muestro informacion de los empleados de una obra
		System.out.println("\n<<Empleados de la obra \"HOTEL I\">>\n");
		its.getCompanyBuildings().get(1).showBuildingEmployees();

		//muestro todas las obras de la Empresa y respectivos costos totales 
		System.out.println("\n<<Obras y precios>>\n");
		its.showBuildingsAndFinalPrices();
	}
}
