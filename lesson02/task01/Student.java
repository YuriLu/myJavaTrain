package by.epam.training.yurilukashevich.lesson02.task01;

import java.util.Objects;

public class Student {
    private String name;
    private int id;
    private double avgMark;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student(String name, int id, double avgMark) {
        this.name = name;
        this.id = id;
        this.avgMark = avgMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = " + name +
                ", id = " + id +
                ", avgMark = " + avgMark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id &&
                avgMark == student.avgMark &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, avgMark);
    }
}
