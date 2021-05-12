package frgp.utn.edu.ar.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;

import frgp.utn.edu.ar.main.MatrizAdyacencia;

public class MatrizAdyacenciaTest {
	
	private MatrizAdyacencia mat = new MatrizAdyacencia(4);
	private MatrizAdyacencia mat2 = new MatrizAdyacencia(2);
	
	/*a. Crear un método llamado agregarElementoTest, que verifique que
	luego de agregar un elemento este elemento exista dentro de la matriz*/
	
	//@Disabled
	@Test
	public void agregarElementoTest() {
			mat.agregarElemento(1, 1); 					
			assertEquals(true, mat.existeElemento(1, 1));
		
	}
	
	/*b. Crear un método llamado agregarElementoSimetriaTest, que
	verifique que luego de agregar un elemento, ese exista en su posición
	opuesta/simétrica. Ejemplo, si agrego un elemento en la posición [2,3],
	verificar que se haya agregado el elemento [3,2]*/
	@Disabled
	@Test
	public void agregarElementoSimetriaTest() {
		mat.agregarElemento(3, 2); 					
		assertEquals(true, mat.existeElemento(3, 2));
		mat.agregarElemento(2, 3); 					
		assertEquals(true, mat.existeElemento(2, 3));
		
	}
	

	@Test
	public void eliminarElementoTest() {
		
		mat.agregarElemento(1, 1); 						// Lleno el elemento para luego eliminarlo
		mat.eliminarElemento(1, 1); 					// elimino el elemento usando el metodo a probar
		assertEquals(false, mat.existeElemento(1, 1));	// Pruebo si el elemento esta vacio
	}
	

	@Test
	public void eliminarElementoSimetricoTest() {
		
		mat.agregarElemento(3,1);						// Lleno el elemento (3,1) y por ende el (1,3)
		mat.eliminarElemento(3, 1);						// Elimino el elemento (3,1) y por ende el (1,3)
		assertEquals(false, mat.existeElemento(1, 3));  // Verifico que el elemento este vacio
	}
	

	public void contarRelacionesTest() {
		mat.agregarElemento(2,3);	
		mat.agregarElemento(1,3);	
		mat.agregarElemento(1,2);	
		assertEquals(3, mat.getCantidadElementos());
	}
	
	@Disabled
	public void existenTodosLosElementoTest() {
		int cont=0;
		for(int i=0; i<4; i++)
		{
		   for(int j=0; j<4; j++)
			   mat.agregarElemento(i, j);
				   cont++;
		}
		for(int i=0; i<mat.getCantidadElementos()/2; i++)
		{
		   for(int j=0; j<mat.getCantidadElementos()/2; j++)
		   {
			   if (i!=j)
			   {
				   assertEquals(true,mat.existeElemento(i, j));
				   assertEquals(true,mat.existeElemento(j, i));
			   }
			   else
			   {
				   assertEquals(true,mat.existeElemento(i, j));
			   }
		   }
		}
		assertEquals(cont*2, mat.getCantidadElementos());//
	}
	
	/*g. Crear un método llamado agregarElementoFilaNegativaTest
	 *que verifique que, si uno quiere agregar un elemento en una fila negativa, 
	 *éste arroje una excepción.*/
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void agregarElementoFilaNegativaTest() {
		mat.agregarElemento(-2,2);
	}

	/*h. Crear un método llamado agregarElementoColumnaNegativaTest
	que verifique que, si uno quiere agregar un elemento en una columna negativa, 
	éste arroje una excepción.*/
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void agregarElementoColumnaNegativaTest() {
		mat.agregarElemento(2,-2);
	}
	
//	i. Crear un método llamado agregarElementoFueraRangoTest que
//	verifique que, si uno quiere agregar un elemento en una columna fuera
//	del rango, éste arroje una excepción. Ejemplo: si tenemos una matriz de
//	2x2,(dos filas, dos columnas) probar que si uno quiere agregar en la
//	columna 3 o fila 3, se arroje una excepción
	

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void agregarElementoFueraRangoTest(){
		mat2.agregarElemento(2,3);
	}


}
