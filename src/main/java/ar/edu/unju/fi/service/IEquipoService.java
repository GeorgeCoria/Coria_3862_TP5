package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Equipo;

public interface IEquipoService {

	public void guardar();
	public void eliminar();
	public Equipo mostrar();
	public Equipo modificar();
}
