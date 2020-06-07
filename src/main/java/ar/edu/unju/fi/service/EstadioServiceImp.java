package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Estadio;
import ar.edu.unju.fi.repository.IEstadio;

/**
 * Clase que implementa la Intefaz IEstadioService
 * Se antepone la annotations @Service de esta manera
 * la declaramos como un bean de Spring dedicada a gestionar
 * la logica de negocios e invocar la ejecucion de
 * transacciones con algun repositorio
 * @author George
 *
 */
@Service
public class EstadioServiceImp implements IEstadioService {
	
	/**
	 * variable que permitira que se haga efectiva la inyeccion de dependencias
	 * a traves de la Annotations @Autowired
	 * En definitiva, cada vez que alguno de los metodos de la
	 * clase EstadioServiceImp sea llamado, Spring hara un escaneo de
	 * un objeto Estadio para luego inyectar al metodo
	 */
	@Autowired
	private IEstadio iestadio;
	
	/**
	 * Metodo dedicado al almacenamiento de registro en los repositorios,
	 * Invoca metodos necesarios para complir el objetivo
	 */
	@Override
	public void guardar() {
		// guardar registro
		iestadio.guardar();
		
	}
	
	/**
	 * Metodo para eliminar registros
	 * invoca metodos de la capa repository
	 * para llevar a cabo dicha transaccion
	 */
	@Override
	public void eliminar() {
		// eliminar registro
		iestadio.eliminar();
		
	}
	
	/**
	 * Metodo que permite la captura de registros,
	 * invoca metodos de la capa repository 
	 */
	@Override
	public Estadio mostrar() {
		// capturar registro
		Estadio estadio=iestadio.mostrar();
		return estadio;
	}
	
	/**
	 * Metodo que permite la modificacion de registros,
	 * invoca metodos de la capa repository 
	 */
	@Override
	public Estadio modificar() {
		// modificar registro
		Estadio estadio=iestadio.modificar();
		return estadio;
	}
	

}
