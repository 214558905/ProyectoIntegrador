package com.rafael.falconi.Api.entities;
import javax.persistence.*;
import java.util.Objects;
@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (unique = true )
    private int id;
    
    private String name;
    @Lob
    private String description, imagen;

    private News(int id, String name, String description, String imagen) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imagen=imagen;
    }

    public News() {

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        News news = (News) obj;
        return Objects.equals(id, news.getId())
                && Objects.equals(name, news.getName())
                && Objects.equals(description, news.getDescription())
                && Objects.equals(imagen, news.getImagen());
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }
    public int getId() {
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
