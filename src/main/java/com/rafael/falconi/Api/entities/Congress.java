package com.rafael.falconi.Api.entities;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.util.Objects;

@Entity
public class Congress {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    
	@Column(columnDefinition = "text")
    private String image;

    

    
	public Congress(String id, String image) {
		super();
		this.id = id;
		this.image = image;
	}

	public Congress(){

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Congress congress = (Congress) obj;
        return Objects.equals(id, congress.getId())
                && Objects.equals(image, congress.getImage());
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
