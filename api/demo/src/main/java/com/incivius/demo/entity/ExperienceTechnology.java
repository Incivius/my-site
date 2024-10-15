package com.incivius.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "experience_technology")
public class ExperienceTechnology {
    @Id
    @ManyToOne
    @JoinColumn(name = "technology_id")
    private Technology technology;

    @Id
    @ManyToOne
    @JoinColumn(name = "experience_id")
    private Experience experience;

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }
}
