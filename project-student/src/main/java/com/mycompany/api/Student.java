package com.mycompany.api;

import java.util.Objects;

public class Student {
    private Integer id;
    private String name;
    private int tuoi;

    public Student() {
    }

    public Student(Integer id,String name, int tuoi) {
        this.id = id;
        this.name = name;
        this.tuoi = tuoi;
    }

    public Student(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
