package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.repository.ICuota;
/**
 * Clase implementadora de la intereface ICuotaService
 * Es definida como bean de Spring, dedicada a gestionar tareas de
 * logica de negocios e invocar la ejecucion de transacciones 
 * en los repositorios
 * 
 * @author George
 *
 */

@Service
public class CuotaServiceImp implements ICuotaService{
	/**
	 * Los metodos declarados en esta clase (CoutaServiceImp)
	 * trabajan con un objeto de tipo ICuota, sin embargo mas adelante 
	 * se notara que ningun metodo esta parametrizado, eso es gracias
	 * a Spring ya que permite la inyeccion de un bean mediante la 
	 * autodeteccion de esta framework.
	 * A traves de la Annotations @Autoeired este
	 * atributo se autoinyecta
	 */
	@Autowired
	private ICuota icuota;

	@Override
	public void guardar() {
		// servicio guardar
		icuota.guardar();
		
	}

	@Override
	public void eliminar() {
		// eliminar un un registro
		icuota.eliminar();
		
	}

	@Override
	public Cuota mostrar() {
		Cuota cuota = icuota.mostrar();
		return cuota;
	}

	@Override
	public Cuota modificar() {
		// Modificar registro
		Cuota cuota = icuota.modificar();
		return cuota;
	}

}
