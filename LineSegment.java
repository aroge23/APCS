package com.company;

public class LineSegment {
    Point start, end;

    public Point getStart() {
        return start;
    }

    public void setStart(Point newStart) {
        start = newStart;
    }

    public double slope() {
        return (end.y - start.y) / (end.x - start.x);
    }
}
