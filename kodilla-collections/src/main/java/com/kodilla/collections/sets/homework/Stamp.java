package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private final String name;
    private final String size;
    private final boolean isPunched;

    public Stamp(String name, String size, boolean isPunched) {
        this.name = name;
        this.size = size;
        this.isPunched = isPunched;
    }

    public String getSize() {
        return size;
    }

    public boolean isPunched() {
        return isPunched;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return isPunched == stamp.isPunched
                && Objects.equals(name, stamp.name)
                && Objects.equals(size, stamp.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, isPunched);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", isPunched=" + isPunched +
                '}';
    }
}
