package com.example.asses3.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class State {
    @Id
    private int id;
    private String statename;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Policy> policies;

    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }


}
