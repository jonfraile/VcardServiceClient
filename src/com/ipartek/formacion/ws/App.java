package com.ipartek.formacion.ws;

import java.rmi.RemoteException;

import com.ipartek.formacion.ws.pojo.Empleado;
import com.ipartek.formacion.ws.service.VcardServiceProxy;

public class App {

	public static void main(String[] args) {

		System.out.println("Vamos a consumir un WebService con SOAP ");

		VcardServiceProxy cliente = new VcardServiceProxy();
		System.out.println("Cliente construido con exito");

		try {
			Empleado e = cliente.getVcard("admin", "admin", 34);
			System.out.println(e.toString());

		} catch (RemoteException e) {
			System.out.println("Excepcion al llamar al WebService");
			e.printStackTrace();
		}

	}

}
