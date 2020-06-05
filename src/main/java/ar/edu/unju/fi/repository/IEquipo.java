package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Equipo;

public interface IEquipo {

	public void guardar();
	public void eliminar();
	public Equipo mostrar();
	public Equipo modificar();
}
