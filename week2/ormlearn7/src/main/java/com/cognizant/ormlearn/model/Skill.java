package com.cognizant.ormlearn.model;

import jakarta.persistence.*;

@Entity
@Table(name = "skill")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sk_id")
    private int id;

    @Column(name = "sk_name")
    private String name;

    public Skill() {
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "Skill [id=" + id + ", name=" + name + "]";
    }
}