package com.example.SistemPrueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.SistemPrueba.Repositorio.RepositorioPersona;
import com.example.SistemPrueba.entidad.Persona;

@SpringBootApplication
public class SistemPruebaApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SistemPruebaApplication.class, args);
	}
	@Autowired
	private RepositorioPersona repositorio;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Persona persona1 = new Persona("nelson",25,"nelson@");
		//repositorio.save(persona1);
		
		
		
	
	}


}
