package frgp.utn.edu.ar.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import frgp.utn.edu.ar.main.MatrizAdyacencia;

class MatrizAdyacenciaTest {
	
	private MatrizAdyacencia Mat = new MatrizAdyacencia(4);
	

	public void agregarElementoTest() {
		
	}
	
	public void agregarElementoSimetriaTest() {
		
	}
	//Prueba
	//@Disabled
	@Test
	public void eliminarElementoTest() {
		
		Mat.agregarElemento(1, 1); 						// Lleno el elemento para luego eliminarlo
		Mat.eliminarElemento(1, 1); 					// elimino el elemento usando el metodo a probar
		assertEquals(false, Mat.existeElemento(1, 1));	// Pruebo si el elemento esta vacio
	}
	
	@Test
	public void eliminarElementoSimetricoTest() {
		
		Mat.agregarElemento(3,1);						// Lleno el elemento (3,1) y por ende el (1,3)
		Mat.eliminarElemento(3, 1);						// Elimino el elemento (3,1) y por ende el (1,3)
		assertEquals(false, Mat.existeElemento(1, 3));  // Verifico que el elemento este vacio
	}
	

	public void contarRelacionesTest() {
		
	}
	
	public void existenTodosLosElementoTest() {
		
	}
	
	public void agregarElementoFilaNegativaTest() {
		
	}

	public void agregarElementoColumnaNegativaTest() {
		
	}

	public void agregarElementoFueraRangoTest() {
		
	}


}
