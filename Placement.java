package com.placementmgmt.entities;
import java.io.Serializable;

@Entity
@Table(name="placement")
public class placement {
    @Id
    private int id;
    private String name;
    private String college;
    private int year;
    private String qualification;
    private float date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public float getDate() {
        return date;
    }

    public void setDate(float date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "placement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", year=" + year +
                ", qualification='" + qualification + '\'' +
                ", date=" + date +
                '}';
    }

    public placement(int id, String name, String college, int year, String qualification, float date) {
        this.id = id;
        this.name = name;
        this.college = college;
        this.year = year;
        this.qualification = qualification;
        this.date = date;
    }
}
