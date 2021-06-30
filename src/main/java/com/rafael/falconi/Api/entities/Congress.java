package com.rafael.falconi.Api.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Congress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (unique = true )
    private int id;
    
    @Lob
    private String image;

    public Congress(int id, String image) {
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
