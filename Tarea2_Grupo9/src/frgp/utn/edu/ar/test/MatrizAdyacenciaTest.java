package frgp.utn.edu.ar.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import frgp.utn.edu.ar.main.MatrizAdyacencia;

class MatrizAdyacenciaTest {
	
	private MatrizAdyacencia Mat = new MatrizAdyacencia(4);
	
	
	/*a. Crear un método llamado agregarElementoTest, que verifique que
	luego de agregar un elemento este elemento exista dentro de la matriz*/
	
	//@Disabled
	@Test
	public void agregarElementoTest() {
			Mat.agregarElemento(1, 1); 					
			assertEquals(true, Mat.existeElemento(1, 1));
		
	}
	
	/*b. Crear un método llamado agregarElementoSimetriaTest, que
	verifique que luego de agregar un elemento, ese exista en su posición
	opuesta/simétrica. Ejemplo, si agrego un elemento en la posición [2,3],
	verificar que se haya agregado el elemento [3,2]*/
	//@Disabled
	@Test
	public void agregarElementoSimetriaTest() {
		Mat.agregarElemento(3, 2); 					
		assertEquals(true, Mat.existeElemento(3, 2));
		Mat.agregarElemento(2, 3); 					
		assertEquals(true, Mat.existeElemento(2, 3));
		
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
