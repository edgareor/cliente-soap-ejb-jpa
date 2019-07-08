package main;

import java.util.List;

import paquete.servicio.soap.Persona;
import paquete.servicio.soap.ProjectJPAEJBSOAP;
import paquete.servicio.soap.ServicioSOAP;

public class ClaseMain {

	public static void main(String[] args) {
		
		ProjectJPAEJBSOAP service = new ProjectJPAEJBSOAP();
		ServicioSOAP consumer = service.getNombreServidorSOAPPort();
		
		List<Persona> out1 = consumer.extraerAll();
		System.out.println(out1);
		System.out.println();
		
		long out2 = consumer.contar();
		System.out.println(out2);
		System.out.println();
		
		int out3 = consumer.extraerMax();
		System.out.println(out3);
		System.out.println();
		
		int out4 = consumer.extraerMin();
		System.out.println(out4);
		System.out.println();
		
		String out5 = consumer.getStatus();
		System.out.println(out5);
		System.out.println();
		
		String out6 = consumer.sumar(200, 200);
		System.out.println(out6);
		System.out.println();
		
		Persona per1 = new Persona();
		per1.setIdPersona(27);
		Persona out7 = consumer.extraerPorId(per1);
		System.out.println(out7);
		System.out.println();
		
		/*
		Persona per2 = new Persona();
		per2.setIdPersona(28);
		per2.setNombrePersona("PRueba");
		per2.setApellidoPersona("Prueba");
		per2.setRutPersona("Prueba");
		String out8 = consumer.insertar(per2);
		System.out.println(out8);
		System.out.println();
		*/
		
		/*
		Persona per3 = new Persona();
		per3.setIdPersona(28);
		per3.setNombrePersona("PRueba2");
		per3.setApellidoPersona("Prueba2");
		per3.setRutPersona("Prueba2");
		String out9 = consumer.modificar(per3);
		System.out.println(out9);
		System.out.println();
		*/
		
		/*
		Persona per4 = new Persona();
		per4.setIdPersona(28);
		String out10 = consumer.eliminar(per4);
		System.out.println(out10);
		System.out.println();
		*/
	}
}