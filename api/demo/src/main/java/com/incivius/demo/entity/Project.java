package com.incivius.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;

    @Column(name = "project_partner", nullable = false, length = 20)
    private String projectPartner;

    @Column(name = "project_problem", nullable = false, length = 300)
    private String projectProblem;

    @Column(name = "project_solution", nullable = false, length = 300)
    private String projectSolution;

    @Column(name = "project_link", nullable = false, length = 100)
    private String projectLink;

    @Column(name = "project_personal_contribution", nullable = false, length = 1000)
    private String projectPersonalContribution;

    @Column(name = "project_hard_skills", nullable = false, length = 500)
    private String projectHardSkills;

    @Column(name = "project_soft_skills", nullable = false, length = 500)
    private String projectSoftSkills;

    @ManyToOne
    @JoinColumn(name = "user_user_id", nullable = false)
    private User user;

    public Long getProjectId() {
        return projectId;
    }

    public String getProjectPartner() {
        return projectPartner;
    }

    public void setProjectPartner(String projectPartner) {
        this.projectPartner = projectPartner;
    }

    public String getProjectProblem() {
        return projectProblem;
    }

    public void setProjectProblem(String projectProblem) {
        this.projectProblem = projectProblem;
    }

    public String getProjectSolution() {
        return projectSolution;
    }

    public void setProjectSolution(String projectSolution) {
        this.projectSolution = projectSolution;
    }

    public String getProjectLink() {
        return projectLink;
    }

    public void setProjectLink(String projectLink) {
        this.projectLink = projectLink;
    }

    public String getProjectPersonalContribution() {
        return projectPersonalContribution;
    }

    public void setProjectPersonalContribution(String projectPersonalContribution) {
        this.projectPersonalContribution = projectPersonalContribution;
    }

    public String getProjectHardSkills() {
        return projectHardSkills;
    }

    public void setProjectHardSkills(String projectHardSkills) {
        this.projectHardSkills = projectHardSkills;
    }

    public String getProjectSoftSkills() {
        return projectSoftSkills;
    }

    public void setProjectSoftSkills(String projectSoftSkills) {
        this.projectSoftSkills = projectSoftSkills;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
