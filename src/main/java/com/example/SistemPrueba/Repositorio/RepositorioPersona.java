package com.example.SistemPrueba.Repositorio;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.SistemPrueba.entidad.Persona;

@Repository
public interface RepositorioPersona extends JpaRepository<Persona, Long>{


	@Query("SELECT p FROM Persona p WHERE p.nombre LIKE %?1%"
			)
	public List<Persona> findAll(String palabra);
	
}
