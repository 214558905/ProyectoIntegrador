package com.rafael.falconi.Api.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Groups {
	
	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
	
	private String linea, grupo, cordinador;

	
	
	 public Groups(String id, String linea, String grupo, String cordinador) {
		this.id = id;
		this.linea = linea;
		this.grupo = grupo;
		this.cordinador = cordinador;
	}

	public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        
	        Groups group = (Groups) obj;
	        
	        return Objects.equals(id, group.getId())
	        		&& Objects.equals(linea, group.getLinea())
	        		&& Objects.equals(grupo, group.getGrupo())
	        		&& Objects.equals(cordinador, group.getCordinador());
	 }
	 
	 @Override
	    public int hashCode() {
		 
		 return Objects.hash(id, linea, grupo, cordinador);
	 }
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getCordinador() {
		return cordinador;
	}

	public void setCordinador(String cordinador) {
		this.cordinador = cordinador;
	}
	
	
	
	

}
