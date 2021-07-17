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
public class WhoAre {
	
	 @Id
	 @GeneratedValue(generator = "UUID")
	 @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	 private String id;
	
	 @Column(columnDefinition = "text")
	  private String descripcion, imagen;
	 
	 private String name;
	 
		
		  
	 

	
	

		public WhoAre(String id, String descripcion, String imagen, String name) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.name = name;
	}

		public WhoAre(){

	    }
		
		@Override
	    public boolean equals(Object obj) {
			
			if(this == obj) return true;
			
			if (obj == null || getClass() != obj.getClass()) return false;
			
			WhoAre whoare = (WhoAre) obj;
			
			return Objects.equals(id, whoare.getId())
				&&  Objects.equals(descripcion, whoare.getDescripcion())
				&&  Objects.equals(imagen, whoare.getImagen())
				&&  Objects.equals(name, whoare.getName());


			
		}
		
		@Override
	    public int hashCode() {
	        return Objects.hash(id, descripcion,imagen,name);
	    }
		
		
		

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
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
		
		
	    

	   
}
