-- Drop tables if they exist
DROP TABLE IF EXISTS experience_skills CASCADE;
DROP TABLE IF EXISTS experience_technology CASCADE;
DROP TABLE IF EXISTS user_skills CASCADE;
DROP TABLE IF EXISTS user_technology CASCADE;
DROP TABLE IF EXISTS project CASCADE;
DROP TABLE IF EXISTS experience CASCADE;
DROP TABLE IF EXISTS skills CASCADE;
DROP TABLE IF EXISTS technology CASCADE;
DROP TABLE IF EXISTS users CASCADE;  -- Renomeado de "user" para users

-- Table: users
CREATE TABLE users (  -- Renomeado de "user" para users
    user_id serial NOT NULL,
    user_email varchar(50) NOT NULL,
    user_telephone varchar(15) NOT NULL,
    user_states varchar(15) NOT NULL,
    user_city varchar(20) NOT NULL,
    user_resume varchar(800) NOT NULL,
    CONSTRAINT users_pk PRIMARY KEY (user_id)  -- Renomeado para users_pk
);

-- Table: skills
CREATE TABLE skills (
    skills_id serial NOT NULL,
    skills_name varchar(20) NOT NULL,
    CONSTRAINT skills_pk PRIMARY KEY (skills_id)
);

-- Table: technology
CREATE TABLE technology (
    technology_id serial NOT NULL,
    technology_name varchar(20) NOT NULL,
    CONSTRAINT technology_pk PRIMARY KEY (technology_id)
);

-- Table: experience
CREATE TABLE experience (
    experience_id serial NOT NULL,
    experience_date_start date NOT NULL,
    experience_date_end date NOT NULL,
    experience_description varchar(300) NOT NULL,
    experience_company varchar(30) NOT NULL,
    user_user_id int NOT NULL,
    CONSTRAINT experience_pk PRIMARY KEY (experience_id),
    CONSTRAINT experience_user_fk FOREIGN KEY (user_user_id) REFERENCES users (user_id)  -- Referência atualizada para users
);

-- Table: experience_skills
CREATE TABLE experience_skills (
    skills_id int NOT NULL,
    experience_id int NOT NULL,
    CONSTRAINT experience_skills_pk PRIMARY KEY (skills_id, experience_id),
    CONSTRAINT experience_skills_fk_skills FOREIGN KEY (skills_id) REFERENCES skills (skills_id),
    CONSTRAINT experience_skills_fk_experience FOREIGN KEY (experience_id) REFERENCES experience (experience_id)
);

-- Table: experience_technology
CREATE TABLE experience_technology (
    technology_id int NOT NULL,
    experience_id int NOT NULL,
    CONSTRAINT experience_technology_pk PRIMARY KEY (technology_id, experience_id),
    CONSTRAINT experience_technology_fk_technology FOREIGN KEY (technology_id) REFERENCES technology (technology_id),
    CONSTRAINT experience_technology_fk_experience FOREIGN KEY (experience_id) REFERENCES experience (experience_id)
);

-- Table: project
CREATE TABLE project (
    project_id serial NOT NULL,
    project_partner varchar(20) NOT NULL,
    project_problem varchar(300) NOT NULL,
    project_solution varchar(300) NOT NULL,
    project_link varchar(100) NOT NULL,
    project_personal_contribution varchar(1000) NOT NULL,
    project_hard_skills varchar(500) NOT NULL,
    project_soft_skills varchar(500) NOT NULL,
    user_user_id int NOT NULL,
    CONSTRAINT project_pk PRIMARY KEY (project_id),
    CONSTRAINT project_user_fk FOREIGN KEY (user_user_id) REFERENCES users (user_id)  -- Referência atualizada para users
);

-- Table: user_skills
CREATE TABLE user_skills (
    skills_id int NOT NULL,
    user_id int NOT NULL,
    CONSTRAINT user_skills_pk PRIMARY KEY (skills_id, user_id),
    CONSTRAINT user_skills_fk_skills FOREIGN KEY (skills_id) REFERENCES skills (skills_id),
    CONSTRAINT user_skills_fk_user FOREIGN KEY (user_id) REFERENCES users (user_id)  -- Referência atualizada para users
);

-- Table: user_technology
CREATE TABLE user_technology (
    user_id int NOT NULL,
    technology_id int NOT NULL,
    CONSTRAINT user_technology_pk PRIMARY KEY (user_id, technology_id),
    CONSTRAINT user_technology_fk_user FOREIGN KEY (user_id) REFERENCES users (user_id),  -- Referência atualizada para users
    CONSTRAINT user_technology_fk_technology FOREIGN KEY (technology_id) REFERENCES technology (technology_id)
);
