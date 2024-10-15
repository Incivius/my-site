package com.incivius.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_skills")
public class UserSkills {
    @Id
    @ManyToOne
    @JoinColumn(name = "skills_id")
    private Skills skills;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Skills getSkill() {
        return skills;
    }

    public void setSkill(Skills skills) {
        this.skills = skills;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
