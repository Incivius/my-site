package com.incivius.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "skills")
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillsId;

    @Column(name = "skills_name", nullable = false, length = 20)
    private String skillsName;

    public Long getSkillsId() {
        return skillsId;
    }

    public String getSkillsName() {
        return skillsName;
    }

    public void setSkillsName(String skillsName) {
        this.skillsName = skillsName;
    }
}
