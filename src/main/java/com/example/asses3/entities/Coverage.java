package com.example.asses3.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Coverage {
    @Id
    private int id;
    private String coveragename;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Policy> policies;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }


    public String getCoveragename() {
        return coveragename;
    }

    public void setCoveragename(String coveragename) {
        this.coveragename = coveragename;
    }
}
