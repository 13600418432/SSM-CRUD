package com.zqx.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Student {
    private Integer id;
    private String name;
    private Double score;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GTM+8")
    private Date birth;
    private Integer age;

    public Student() {
    }

    public Student(Integer id, String name, Double score, Date birth, Integer age) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.birth = birth;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", birth=" + birth +
                ", age=" + age +
                '}';
    }
}
