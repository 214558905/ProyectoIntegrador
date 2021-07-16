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
	  private String quienesSomos, razon;
	  
	    
		
		  
	 public WhoAre(String id, String quienesSomos, String razon) {
	
		this.id = id;
 		this.quienesSomos = quienesSomos;
    	this.razon = razon;
	 }

		public WhoAre(){

	    }
		
		@Override
	    public boolean equals(Object obj) {
			
			if(this == obj) return true;
			
			if (obj == null || getClass() != obj.getClass()) return false;
			
			WhoAre whoare = (WhoAre) obj;
			
			return Objects.equals(id, whoare.getId())
				&&  Objects.equals(quienesSomos, whoare.getQuienesSomos())
				&& 	Objects.equals(razon, whoare.getRazon());


			
		}
		
		@Override
	    public int hashCode() {
	        return Objects.hash(id, quienesSomos, razon);
	    }

		

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getQuienesSomos() {
			return quienesSomos;
		}

		public void setQuienesSomos(String quienesSomos) {
			this.quienesSomos = quienesSomos;
		}

		public String getRazon() {
			return razon;
		}

		public void setRazon(String razon) {
			this.razon = razon;
		}
		
	    

	   
}
