package com.example.SistemPrueba.Servicio;

import java.util.List;

import com.example.SistemPrueba.entidad.Persona;

public interface ServicioPersona {
	
	public List<Persona> ListarPersonas(String palabra);
	
	public Persona SavePersona(Persona persona);
	
	public Persona ObtenerPersonaPorId(Long id);
	
	public Persona ActualizarPersona(Persona persona);
	
	public void EliminarPersona(Long id);

}
