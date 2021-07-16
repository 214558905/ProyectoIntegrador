package com.rafael.falconi.Api.entities;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.util.Objects;
@Entity
public class Organization {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
	
    private String name;
    
    @Column(columnDefinition = "text")
    private String text;
    
    @Column(columnDefinition = "text")
    private String imagen;
    

    
    public Organization(String id, String name, String text, String imagen) {
		this.id = id;
		this.name = name;
		this.text = text;
		this.imagen = imagen;
	}
	public Organization(){

    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Organization organization = (Organization) obj;
        return Objects.equals(id, organization.getId())
                && Objects.equals(name, organization.getName())
                && Objects.equals(text, organization.getText())
                && Objects.equals(imagen, organization.getImagen());
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, text, imagen);
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

