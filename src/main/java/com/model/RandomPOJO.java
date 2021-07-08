package com.model;

import java.util.Objects;

public class RandomPOJO {

    private int id;
    private String name;
    private LinkedRandomPOJO linkedRandomPOJO;

    public RandomPOJO(int id, String name, LinkedRandomPOJO linkedRandomPOJO) {
        this.id = id;
        this.name = name;
        this.linkedRandomPOJO = linkedRandomPOJO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedRandomPOJO getLinkedRandomPOJO() {
        return linkedRandomPOJO;
    }

    public void setLinkedRandomPOJO(LinkedRandomPOJO linkedRandomPOJO) {
        this.linkedRandomPOJO = linkedRandomPOJO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RandomPOJO that = (RandomPOJO) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(linkedRandomPOJO, that.linkedRandomPOJO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, linkedRandomPOJO);
    }

    @Override
    public String toString() {
        return "RandomPOJO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", linkedRandomPOJO=" + linkedRandomPOJO +
                '}';
    }
}
