package com.rafael.falconi.Api.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Rules {

		@Id
		@GeneratedValue(generator = "UUID")
		@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	    private String id;
	    private String name;
	    
	    @Column(columnDefinition = "text")
	    private String enlace, imagen;
	    
	    
	    
	    public Rules(String id, String name, String enlace, String imagen) {
			this.id = id;
			this.name = name;
			this.enlace = enlace;
			this.imagen = imagen;
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
	        		&& Objects.equals(name, reglas.getName())
	        		&& Objects.equals(imagen, reglas.getImagen());
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id, name, enlace, imagen);
	    }
	    
	    
	   

	    public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getImagen() {
			return imagen;
		}
		public void setImagen(String imagen) {
			this.imagen = imagen;
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
