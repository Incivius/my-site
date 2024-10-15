package com.incivius.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "technology")
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long technologyId;

    @Column(name = "technology_name", nullable = false, length = 20)
    private String technologyName;

    public Long getTechnologyId() {
        return technologyId;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }
}
