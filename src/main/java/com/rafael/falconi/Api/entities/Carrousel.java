package com.rafael.falconi.Api.entities;


import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.util.Objects;

@Entity
public class Carrousel {
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;
    
	@Column(columnDefinition = "text")
    private String image;
	
	
    public Carrousel(String id, String image) {
		this.id = id;
		this.image = image;
	}
	public Carrousel(){

    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Carrousel carrousel = (Carrousel) obj;
        return Objects.equals(id, carrousel.getId())
        		&& Objects.equals(image, carrousel.getImage());
    }
    @Override
    public int hashCode() { 
    	return Objects.hash(id, image); 
    }
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
    
}