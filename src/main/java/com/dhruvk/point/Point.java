package com.dhruvk.point;

import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return (this.x == point.x && this.y == point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
