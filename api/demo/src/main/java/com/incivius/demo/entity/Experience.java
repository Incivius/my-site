package com.incivius.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "experience")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long experienceId;

    @Column(name = "experience_date_start", nullable = false)
    private LocalDate experienceDateStart;

    @Column(name = "experience_date_end", nullable = false)
    private LocalDate experienceDateEnd;

    @Column(name = "experience_description", nullable = false, length = 300)
    private String experienceDescription;

    @Column(name = "experience_company", nullable = false, length = 30)
    private String experienceCompany;

    @ManyToOne
    @JoinColumn(name = "user_user_id", nullable = false)
    private User user;

    public Long getExperienceId() {
        return experienceId;
    }

    public LocalDate getExperienceDateStart() {
        return experienceDateStart;
    }

    public void setExperienceDateStart(LocalDate experienceDateStart) {
        this.experienceDateStart = experienceDateStart;
    }

    public LocalDate getExperienceDateEnd() {
        return experienceDateEnd;
    }

    public void setExperienceDateEnd(LocalDate experienceDateEnd) {
        this.experienceDateEnd = experienceDateEnd;
    }

    public String getExperienceDescription() {
        return experienceDescription;
    }

    public void setExperienceDescription(String experienceDescription) {
        this.experienceDescription = experienceDescription;
    }

    public String getExperienceCompany() {
        return experienceCompany;
    }

    public void setExperienceCompany(String experienceCompany) {
        this.experienceCompany = experienceCompany;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
