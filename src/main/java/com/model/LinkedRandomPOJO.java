package com.model;

import java.util.Date;
import java.util.Objects;

public class LinkedRandomPOJO {
    private final int id;
    private final String name;
    private Long serial;
    private Date randomDate;

    public LinkedRandomPOJO(int id, String name, Long serial, Date randomDate){
        this.id = id;
        this.name = name;
        this.serial = serial;
        this.randomDate = randomDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getSerial() {
        return serial;
    }

    public void setSerial(Long serial) {
        this.serial = serial;
    }

    public Date getRandomDate() {
        return randomDate;
    }

    public void setRandomDate(Date randomDate) {
        this.randomDate = randomDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedRandomPOJO that = (LinkedRandomPOJO) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(serial, that.serial) &&
                Objects.equals(randomDate, that.randomDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, serial, randomDate);
    }

    @Override
    public String toString() {
        return "LinkedRandomPOJO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", serial=" + serial +
                ", randomDate=" + randomDate +
                '}';
    }
}
