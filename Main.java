package softwareParaLaConstruccion;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		//instancio nueva Empresa -- defino su nombre
		Empresa its = new Empresa("Its");
		
		//instancio empleados de la empresa
		Empleado e0 = new Arquitecto("Laura Ibañez","10.789.101","223 510789",0000);
		Empleado e1 = new Arquitecto("Horacio Weber","11.789.456","223 511456",1111);
		Empleado e2 = new Arquitecto("Marta Castillo","21.456.111","223 521165",2222);
		
		Empleado e3 = new MaestroMayor("Augusto Fleme","12.456.789","223 512789",56);
		Empleado e4 = new MaestroMayor("Alejandra Uribarri","14.234.123","223 614123",48);
		Empleado e5 = new MaestroMayor("Guillermo Juncos","237.987.321","223 6237987",50);
		Empleado e6 = new MaestroMayor("Maximiliano Gutierrez","13.123.321","223 513321",52);
		
		Empleado e7 = new Obrero("Alejandro Arquri","15.456.123","223 615123",33);
		Empleado e8 = new Obrero("Juan Erasun","16.987.321","223 416321",28);
		Empleado e9 = new Obrero("Adrián Suarez","24.564.321","223 156789",48);
		Empleado e10 = new Obrero("Sergio Di Santos","27.657.851","223 684523",50);
		Empleado e11 = new Obrero("Julio Arquri","28.654.231","011 546325",23);
		Empleado e12 = new Obrero("Ignacio Minuchín","27.845.885","223 522623",25);
		
		//agrupo los empleados 
		ArrayList <Empleado> companyEmployees = new ArrayList<Empleado>();
		companyEmployees.add(e0);
		companyEmployees.add(e1);
		companyEmployees.add(e2);
		companyEmployees.add(e3);
		companyEmployees.add(e4);
		companyEmployees.add(e5);
		companyEmployees.add(e6);
		companyEmployees.add(e7);
		companyEmployees.add(e8);
		companyEmployees.add(e9);
		companyEmployees.add(e10);
		companyEmployees.add(e11);
		companyEmployees.add(e12);
		
		//defino la lista de empleados de la empresa
		its.setCompanyEmployees(companyEmployees);
		
		
		
		//defino empleados para la Obra ob1 (ObraDomestica)
		ArrayList<Empleado> ob1Employees = new ArrayList<Empleado>();
		ob1Employees.add(e1);
		ob1Employees.add(e3);
		ob1Employees.add(e8);
		ob1Employees.add(e9);
		ob1Employees.add(e10);
		
		//si la lista de Empleados esta chequeada => la defino para los empleados de la Obra ob1
		if(checkEmployees(ob1Employees)) {
			Obra ob1 = new ObraDomestica("First Road 123",120,90,10.5,ob1Employees,6);
			its.getCompanyBuildings().add(ob1);
		}else { //si no pasa el chequeo => advierto que se controle la lista de Empleado
			System.out.println("Controle la cantidad y tipo de empleados asignados");
		}
		
		
		
		//defino empleados para la Obra ob2 (ObraComercial > Hotel)
		ArrayList<Empleado> ob2Employees = new ArrayList<Empleado>();
		ob2Employees.add(e0);
		ob2Employees.add(e4);
		ob2Employees.add(e5);
		ob2Employees.add(e7);
		ob2Employees.add(e8);
		ob2Employees.add(e9);
		ob2Employees.add(e12);
		
		//si la lista de Empleados esta chequeada => la defino para los empleados de la Obra ob2
		if(checkEmployees(ob2Employees)) {
			Obra ob2 = new Hotel("Second Road 456",250,320,12.2,ob2Employees,"Its Hotel I",20);
			its.getCompanyBuildings().add(ob2);
		}else { //si no pasa el chequeo => advierto que se controle la lista de Empleado
			System.out.println("Controle la cantidad y tipo de empleados asignados");
		}
		
		
		
		//defino empleados para la Obra ob3 (ObraComercial > Comercio)
		ArrayList<Empleado> ob3Employees = new ArrayList<Empleado>();
		ob3Employees.add(e2);
		ob3Employees.add(e6);
		ob3Employees.add(e7);
		ob3Employees.add(e9);
		ob3Employees.add(e10);
		ob3Employees.add(e11);
		ob3Employees.add(e12);
		
		//si la lista de Empleados esta chequeada => la defino para los empleados de la Obra ob2
		if(checkEmployees(ob3Employees)) {
			Obra ob3 = new Hotel("Third Road 789",180.5,380,20.2,ob3Employees,"Its Comercio I",2);
			its.getCompanyBuildings().add(ob3);
		}else { //si no pasa el chequeo => advierto que se controle la lista de Empleado
			System.out.println("Controle la cantidad y tipo de empleados asignados");
		}

		
		
		
		//muestro todos los empleados de una obra
		if(its.getCompanyBuildings().get(0) instanceof ObraDomestica) {
			System.out.println("La obra 1 de la empresa es una Obra Doméstica de "+((ObraDomestica)its.getCompanyBuildings().get(0)).getRooms()+" habitaciones");
			System.out.println(((ObraDomestica)its.getCompanyBuildings().get(0)).toString());
		}
		
//		System.out.println(((ObraDomestica)its.getCompanyBuildings().get(0)).toString());
		
	}
	
	//controla q haya 1 Arquitecto, entre 1 y 3 MaestroMayor y por lo menos 2 Obrero por obra de construccion
	private static boolean checkEmployees(ArrayList<Empleado> employees) {
		boolean employeesCheck = false;
		int arqs = 0;
		int mm = 0;
		int obrs = 0;
		for(Empleado e : employees) {
			if(e instanceof Arquitecto) arqs++;
			if(e instanceof MaestroMayor) mm++;
			if(e instanceof Obrero) obrs++;
		}
		if(arqs==1 && mm>=1 && mm<=3 && obrs >=2) {
			employeesCheck = true;
		}
		return employeesCheck;
	}

}
