package com.rafael.falconi.Api.entities;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.Objects;
@Entity
public class Organization {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column (unique = true )
    private int id;
    private String name;
    
    @Lob
    private String text;

    public Organization(int id, String name, String text) {
        this.id = id;
        this.name = name;
        this.text = text;
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
                && Objects.equals(text, organization.getText());
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, text);
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

