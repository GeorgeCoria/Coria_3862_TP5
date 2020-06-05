package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.repository.IEquipo;

/**
 * Clase que implenta la Interfaz IEquipoService
 * Definida como un bean de Spring mediante la Annotations @Service
 * Difinida asi, ya que esta dedicada a gestionar tareas de la logica de 
 * negocios e invocar la ejecucion de transacciones en los repositorios
 * 
 * @author George
 *
 */
@Service
public class EquipoServiceImp implements IEquipoService{
	
	/**
	 * Los metodos implementados en esta clase IEquipoService
	 * realizan  operacione utilizando un objeto de tipo IEquipo
	 * @Autowired es una annotation de Spring que permite inyectar
	 * una dependencia mediante la autodeteccion de Spring
	 * Gracia a esto, el aributo iequipo tomara valores para luego
	 * los metodos puedan trabajar con estos.
	 */
	@Autowired
	private IEquipo iequipo;

	/**
	 * metodo para guardar un registro en el repositorio
	 */
	@Override
	public void guardar() {
		
		iequipo.guardar();
		
	}

	/**
	 * meodo para elimiar un registro
	 */
	@Override
	public void eliminar() {
		// eliminar un registro
		
	iequipo.eliminar();
	}
	
	/**
	 * metodo que permite capturar
	 * un registro del repositorio
	 */
	@Override
	public Equipo mostrar() {
		//mostrar registro
		Equipo equipo=iequipo.mostrar();
		return equipo;
	}

	/**
	 * Meodo para realizar modificaciones 
	 * a un registro del repositorio
	 */
	@Override
	public Equipo modificar() {
		// modificar registro
		Equipo equipo=iequipo.mostrar();
		return equipo;
	}

}
