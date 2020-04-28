package com.crud.personas.modelo;

import java.util.Date;



import lombok.Data;

@Data
public class ModeloPersona {
	
	private int id ;
	private String nombre;
	private String tipoDocumento;
	private int numeroDocumento;
	private Date fechaNacimineto;
	private String genero;
	private float salario;
	

}
