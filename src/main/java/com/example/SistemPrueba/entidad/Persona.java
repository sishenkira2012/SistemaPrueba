package com.example.SistemPrueba.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="personas")
public class Persona {
	
	//atirbutos 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nombre")
	
	private String nombre;
	
	@Column(name = "edad")
	private int edad;
	
	@Column(name = "email")
	private String correo;
	
	//consturctor vacio
	public Persona() {
		
	}
	

	public Persona(String nombre, int edad, String correo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
	}


	public Persona(long id, String nombre, int edad, String correo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + "]";
	}
	
	
	
	

}
