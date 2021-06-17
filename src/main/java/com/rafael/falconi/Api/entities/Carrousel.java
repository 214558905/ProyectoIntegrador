package com.rafael.falconi.Api.entities;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.Objects;
import javax.persistence.Entity;

@Entity
public class Carrousel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (unique = true)
    private int id;
    
    private String image;
    private Carrousel (int id, String image){
        this.id= id;
        this.image=image;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
    
}