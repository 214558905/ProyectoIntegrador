package com.rafael.falconi.Api.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Areas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (unique = true )
    private int id;

    private String dominio, linea;
    
    public Areas(int id, String dominio, String linea) {
        this.id = id;
        this.dominio = dominio;
        this.linea = linea;
    }
    
    public Areas(){

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Areas areas = (Areas) obj;
        return Objects.equals(id, areas.getId())
                && Objects.equals(dominio, areas.getDomain())
                && Objects.equals(linea, areas.getLine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dominio, linea);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDomain() {
        return dominio;
    }

    public void setDomain(String dominio) {
        this.dominio = dominio;
    }

    public String getLine() {
        return linea;
    }

    public void setLine(String linea) {
        this.linea = linea;
    }
}
