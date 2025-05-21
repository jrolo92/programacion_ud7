package ejercicio10;

import java.io.Serializable;
import java.util.Objects;

//Plantilla general de la clase Persona.
public class Persona implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// Atributos
	private String nombre;
	private String apellidos;
	private int edad;
	private double estatura;
	
	// Métodos
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		Persona other = (Persona) obj;
		return edad == other.edad && Double.doubleToLongBits(estatura) == Double.doubleToLongBits(other.estatura)
				&& Objects.equals(nombre, other.nombre);
	}


//	Constructor de persona con parámetros.
	public Persona(String nombre, String apellidos, int edad, double estatura) {
		// Primero el atributo y luego el parámetro del método.
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.estatura = estatura;
	}

	
	// Constructor con dos parámetros
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
//	Constructor por defecto
	public Persona() {};

//  Getters y Setters:
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		if (edad<0) {
			throw new IllegalArgumentException("Edad debe ser mayor a 0");
		}
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}



}