package com.app.doTasks.driven_adapter.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

import javax.persistence.TemporalType;

@Entity
@Table(name = "tasks")
public class TaskEntity {
	/*
	 * Entidad de Persistencia -> representa la version de persistencia
	 * de la entidad de dominio de Tarea
	 * Anotada con JPA -> Java Persistence API para especificar como
	 * debe ser mapeada una tabla en la DB
	 * Se utiliza para interactuar con la capa de persistencia y almacenar
	 * o recuperar datos de la DB
	 * 
	 * La persistencia es el proceso de almacenar y recuperar datos
	 * de una DB
	 * 
	 * Las entidades son objetos de negocio que se mapean a tablas en la DB
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "duracion")
	private String duracion;
	
	@Column(name = "prioridad")
	private String prioridad;
	
	@Column(name = "categoria")
	private String categoria;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_limite")
	private String fechaLimite;
	
	@Column(name = "is_completed")
	private boolean isCompleted;

	
}
