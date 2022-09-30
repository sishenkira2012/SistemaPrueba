package com.example.SistemPrueba.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SistemPrueba.Repositorio.RepositorioPersona;
import com.example.SistemPrueba.entidad.Persona;

@Service
public class ImplPersona implements ServicioPersona {
	
	@Autowired
	private RepositorioPersona repositorio;

	@Override
	public List<Persona> ListarPersonas(String palabra) {
		// TODO Auto-generated method stub
		if(palabra !=null) {
			return repositorio.findAll(palabra);
			
		}
	
		return repositorio.findAll();
	}

	@Override
	public Persona SavePersona(Persona persona) {
		// TODO Auto-generated method stub
		return repositorio.save(persona);
	}

	@Override
	public Persona ObtenerPersonaPorId(Long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).get();
	}

	@Override
	public Persona ActualizarPersona(Persona persona) {
		// TODO Auto-generated method stub
		return repositorio.save(persona);
	}

	@Override
	public void EliminarPersona(Long id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}
	
	

}
