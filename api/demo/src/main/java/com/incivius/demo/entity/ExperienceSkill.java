package com.incivius.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "experience_skills")
public class ExperienceSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skills_id")
    private Skills Skills;

    @Id
    @ManyToOne
    @JoinColumn(name = "experience_id")
    private Experience experience;

    public Skills getSkill() {
        return Skills;
    }

    public void setSkill(Skills Skills) {
        this.Skills = Skills;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }
}
