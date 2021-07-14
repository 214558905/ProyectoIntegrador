package com.rafael.falconi.Api.entities;


import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.util.Objects;
@Entity
public class Events {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;
	
    private String name;
    @Column(columnDefinition = "text")
    private String description;
    
    @Column(columnDefinition = "text")
    private String imagen;


    
    
	public Events(String id, String name, String description, String imagen) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.imagen = imagen;
	}
	public Events(){

    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Events events = (Events) obj;
        return Objects.equals(id, events.getId())
                && Objects.equals(name, events.getName())
                && Objects.equals(description, events.getDescription())
                && Objects.equals(imagen, events.getImagen());
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, imagen);
    }

    
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}
