package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.repository.IResultado;

/**
 * Clase que implementa la interfar IResutadoService
 * Mediante la annotation @Service, Spring define a la
 * clase como un bean dedicado la gestionar tareas de la 
 * logica de negocios e invocar la ejecucion de transacciones
 * en los repositorios
 *
 * @author George
 *
 */
@Service
public class ResultadoServiceImp implements IResultadoService{
	
	
	/**
	 * los metodos que implementa esta clase necesitan 
	 * de un objeto, utilizaremos la autodeccion de Spring,
	 * para que el atributo logre tomar datos a traves de la 
	 * inyeccion de dependencias. Se antepone la annotation 
	 * @Autowired que permite la inyeccion de un bean de Spring
	 * 
	 */
	@Autowired
	private IResultado iresultado;
	
	@Override
	public Resultado mostrar() {
		// Intrucciones para capurar un registro
		Resultado resultado = iresultado.mostrar();
		return resultado;
	}

	@Override
	public Resultado modificar() {
		// Instrucciones para modificar un registro
		Resultado resultado = iresultado.modificar();
		return resultado;
	}

	@Override
	public void guardar() {
		// guardar registro
		iresultado.guardar();
		
	}

	@Override
	public void eliminar() {
		// eliminar registro
		iresultado.eliminar();
		
	}
	
	
}
