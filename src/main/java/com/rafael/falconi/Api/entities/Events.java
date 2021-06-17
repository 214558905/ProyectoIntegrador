package com.rafael.falconi.Api.entities;


import javax.persistence.*;
import java.util.Objects;
@Entity
public class Events {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (unique = true )
    private int id;
    
    private String name;
    
    
    
    @Lob
    private String description;
    private Events (int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
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
                && Objects.equals(description, events.getDescription());
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
}
