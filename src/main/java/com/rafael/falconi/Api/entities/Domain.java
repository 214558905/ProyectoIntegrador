package com.rafael.falconi.Api.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Domain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (unique = true )
    private int id;

    private String dominio, linea;

    public Domain(int id, String dominio, String linea) {
        this.id = id;
        this.dominio = dominio;
        this.linea = linea;
    }

    public Domain(){

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Domain domain = (Domain) obj;
        return Objects.equals(id, domain.getId())
                && Objects.equals(dominio, domain.getDomain())
                && Objects.equals(linea, domain.getLine());
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
