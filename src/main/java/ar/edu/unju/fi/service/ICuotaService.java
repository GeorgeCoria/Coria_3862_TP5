package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Cuota;

public interface ICuotaService {

	public void guardar();
	public void eliminar();
	public Cuota mostrar();
	public Cuota modificar();
}
