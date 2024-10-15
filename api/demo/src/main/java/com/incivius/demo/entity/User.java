package com.incivius.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "user_email", nullable = false, length = 50)
    private String userEmail;

    @Column(name = "user_telephone", nullable = false, length = 15)
    private String userTelephone;

    @Column(name = "user_states", nullable = false, length = 15)
    private String userStates;

    @Column(name = "user_city", nullable = false, length = 20)
    private String userCity;

    @Column(name = "user_resume", nullable = false, length = 800)
    private String userResume;

    public User() {}

    public User(String userEmail, String userTelephone, String userStates, String userCity, String userResume) {
        this.userEmail = userEmail;
        this.userTelephone = userTelephone;
        this.userStates = userStates;
        this.userCity = userCity;
        this.userResume = userResume;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    public String getUserStates() {
        return userStates;
    }

    public void setUserStates(String userStates) {
        this.userStates = userStates;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserResume() {
        return userResume;
    }

    public void setUserResume(String userResume) {
        this.userResume = userResume;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userEmail='" + userEmail + '\'' +
                ", userTelephone='" + userTelephone + '\'' +
                ", userStates='" + userStates + '\'' +
                ", userCity='" + userCity + '\'' +
                ", userResume='" + userResume + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return userId != null && userId.equals(user.userId);
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
