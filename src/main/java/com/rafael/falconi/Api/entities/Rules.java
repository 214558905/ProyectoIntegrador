package com.rafael.falconi.Api.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Rules {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column (unique = true )
	    private int id;
	    private String name, enlace;

	    private Rules(int id, String enlace, String name ){
	        this.id = id;
	        this.name = name;
	        this.enlace = enlace;
	    }
	    public Rules(){

	    }
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Rules reglas = (Rules) obj;
	        return Objects.equals(id, reglas.getId())
	                && Objects.equals(enlace, reglas.getEnlace())
	        		&& Objects.equals(name, reglas.getName());
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id, name, enlace);
	    }

	    public  int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEnlace() {
	        return enlace;
	    }

	    public void setEnlace(String enlace) {
	        this.enlace = enlace;
	    }
	
}
