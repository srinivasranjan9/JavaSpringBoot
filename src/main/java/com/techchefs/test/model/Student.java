package com.techchefs.test.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements Serializable {

    @Column(name = "name")
    private String name;

    @Id
    @Column(name = "id")
    @JsonProperty(value = "rollNumber")
    private Long id;

    @Column(name = "grade")
    private String grade;

    @Column(name = "gender")
    private String gender;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getGrade() {

        return grade;
    }

    public void setGrade(String grade) {

        this.grade = grade;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }
}
