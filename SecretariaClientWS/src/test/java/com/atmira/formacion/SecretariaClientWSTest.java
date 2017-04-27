package com.atmira.formacion;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceException;

import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;

import com.atmira.formacion.wsclient.SecretariaServiceImpl;

import junit.framework.Assert;

public class SecretariaClientWSTest {
	
	private final static String END_POINT_URL = "http://localhost:8080/SecretariaIT/ws/Profesor?wsdl";
	
	private static SecretariaServiceImpl secretariaService;

	@BeforeClass
	public static void setUp() throws Exception {
		try {
			URL wsdlUrl = new URL(END_POINT_URL);
	        QName qname = new QName("http://service.ws.secretariaIT.formacion.atmira.com/", "SecretariaServiceImplService");
	        javax.xml.ws.Service service = javax.xml.ws.Service.create(wsdlUrl, qname);
	        secretariaService = service.getPort(SecretariaServiceImpl.class);
		} catch (WebServiceException wse) {
			System.out.println("[setUp] Excepcion al inicializar el cliente WS_:: " + wse.getMessage());
			secretariaService = null;
		}
	}

	@Test
	public void testAddProfesor() throws Exception {
		Assume.assumeNotNull(secretariaService);
		
		int result = secretariaService.addProfesor("777777D", "Rodrigo Rato");
		Assert.assertTrue(result >= 0);
	}
	
	@Test
	public void testAddAlumno() {
		Assume.assumeNotNull(secretariaService);
		
	}
	
	@Test
	public void testCalcularPromedioProfesor() {
		Assume.assumeNotNull(secretariaService);
		
	}

}
