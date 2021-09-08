package com.mytests.micronaut.data;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * *
 * <p>Created by irina on 07.09.2021.</p>
 * <p>Project: micronaut-r2dbc-rx</p>
 * *
 */
@Entity
public class Tab3 {
    @Id
    @GeneratedValue
    int id;
    String first;
    String second;
    int third;
    boolean forth;

    public Tab3() {
    }

    public Tab3(String first, String second, int third, boolean forth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.forth = forth;
    }

    public int getId() {
        return id;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public int getThird() {
        return third;
    }

    public boolean isForth() {
        return forth;
    }

    @Override
    public String toString() {
        return "Tab1: " +
                "id=" + id +
                ", first='" + first + '\'' +
                ", second='" + second + '\'' +
                ", third=" + third +
                ", forth=" + forth +
                ' ';
    }
}
